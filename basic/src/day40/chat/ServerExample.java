package day40.chat;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class ServerExample extends Application{

	ExecutorService executorService;
	ServerSocket serverSocket;
	List<Client> connections = new Vector<Client>();
	//ArrayList의 동기화 버전 = Vector
	
	void startServer() {
		executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());//내가 사용가능한 만큼만 스레드풀만들겠다.
		
		try {
			serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress("localhost",5001));
		}catch(Exception e ) {
			if(!serverSocket.isClosed()) { stopServer(); }
				
			return;		//문제가 생기면 return으로 끝낸다.
		}
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				Platform.runLater( ()-> {
				displayText("[서버시작]");
				btnStartStop.setText("stop"); 	//버튼 만들기
			});	while(true) {
					try {
						Socket socket = serverSocket.accept();
						String message = "[연결 수락: "+socket.getRemoteSocketAddress()
						+" : "+ Thread.currentThread().getName()+"]";
					Client client = new Client(socket);
					connections.add(client);	//클라이언트 객체를 만들어서 클라이언트 객체에 들어있는 애들만 받을 수 있다. 
					Platform.runLater(()->displayText(message));
					Platform.runLater(()->displayText("[연결개수: "+connections.size()+"]"));
					}catch(Exception e) {
						if(!serverSocket.isClosed()) stopServer();
						break;
					}
				}
			}
		};
		executorService.submit(runnable);
		
		
		
		
	}
	
	void stopServer() {
		try {
			Iterator<Client> iterator = connections.iterator();
			while(iterator.hasNext()) {
				Client client = iterator.next();
				client.socket.close();
				iterator.remove();	//컬렉션 프레임워크의 같은 값을 깨끗하게 제거해준다. List를 비워줌
			}
			if(serverSocket!=null && !serverSocket.isClosed()) {
				serverSocket.close();
			}
			if(executorService!=null && !executorService.isShutdown()) {
				executorService.shutdown();
			}
			Platform.runLater(()->{displayText("[서버멈춤]");
			 btnStartStop.setText("start");
			});
		
		}catch(Exception e) {
			
		}
	}
	
	
	
	
	class Client {
		Socket socket;
		
		Client(Socket socket) {
			this.socket = socket;
			receive();		//클라이언트가 들어와서 메시지를 받는 새로운 메소드
		}
		void receive() {
			Runnable runnable = new Runnable() {
				@Override
				public void run() {
				
					
					try {
						while(true) {
							byte[] byteArr = new byte[100];
							InputStream inputStream = socket.getInputStream();
							
							int readByteCount = inputStream.read(byteArr);
							
							if(readByteCount ==-1) {throw new IOException();}
							//만약에 읽을 내용이 없다 (-1이 된다)면 exception을 던져준다.
							
							
							String message = "[요청처리: " +socket.getRemoteSocketAddress()+":"
									+Thread.currentThread().getName()+"]";
							
							Platform.runLater(() ->displayText(message));
							
							String data = new String(byteArr,0,readByteCount,"UTF-8");
							
							for(Client client : connections) {
								client.send(data);		//client 한명한명에게 전송한다.
							}
						}
					
					
				}catch (Exception e) {
					try {
						connections.remove(Client.this);
					
					String message = "[클라이언트통신안됨: "+socket.getRemoteSocketAddress()
						+" : "+Thread.currentThread().getName() +"]";
					Platform.runLater(()->displayText(message));
					socket.close();
					} catch(IOException e1) {
						e1.printStackTrace();
					}
					e.printStackTrace();
				}
			}
			
		};
		executorService.submit(runnable);
		}
		void send(String data ) {
			Runnable runnable = new Runnable() {
				
				@Override
				public void run() {
					try {
						byte[] byteArr = data.getBytes("UTF-8");
						OutputStream outputStream = socket.getOutputStream();
						outputStream.write(byteArr);
						outputStream.flush();
						
						
					} catch (Exception e) {
						try {
							String message = "[클라이언트 통신 안됨: "+socket.getRemoteSocketAddress()+" : "
									+ Thread.currentThread().getName()+"]";
							Platform.runLater(()->displayText(message));
							connections.remove(Client.this);
							socket.close();
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						e.printStackTrace();
					}
				}
			};
			executorService.submit(runnable);
		}
		
	
	}	
	
	
	//UI생성코드
	
	TextArea txtDisplay;
	Button btnStartStop;

	@Override
	public void start(Stage primaryStage) throws Exception {
		BorderPane root = new BorderPane();
		root.setPrefSize(800, 500);
		
		txtDisplay =  new TextArea();
		txtDisplay.setEditable(false);
		BorderPane.setMargin(txtDisplay, new Insets(0,0,2,0));
		root.setCenter(txtDisplay);
		
		btnStartStop = new Button("start");
		btnStartStop.setPrefHeight(30);
		btnStartStop.setMaxWidth(Double.MAX_VALUE);
		
		btnStartStop.setOnAction(e-> {
			if(btnStartStop.getText().contentEquals("start")) {
				startServer();
			}else if(btnStartStop.getText().equals("stop")) {
				stopServer();
			}
		});
		root.setBottom(btnStartStop);
		
		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().
				getResource("app.css").toString());
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("서버");
		primaryStage.setOnCloseRequest(event->stopServer());
		primaryStage.show();
		
	}
	
	//javafx 메소드 생성
	void displayText(String text) {
		txtDisplay.appendText(text + "\n");
	}
	
	//메인코드
	public static void main(String[] args) {
		launch(args);
	}

	

}
