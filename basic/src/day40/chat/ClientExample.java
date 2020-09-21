package day40.chat;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.io.OutputStream;

import java.net.Socket;



import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Insets;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class ClientExample extends Application{
	
	Socket socket;
	
	void startClient() {
		Thread thread = new Thread() {
			@Override
			public void run() {
				try {
					socket = new Socket();
					socket.connect(new InetSocketAddress("10.5.5.0",5001));
					
					Platform.runLater(()->{ displayText("[연결완료: "+socket.getRemoteSocketAddress()+"]");
					btnConn.setText("stop");
					btnSend.setDisable(false);
				});
				
				}catch(Exception e) {
					Platform.runLater(() -> displayText("[서버 통신 안됨]"));
					if(!socket.isClosed()) stopClient();
					return;
					
					
				}
				receive();
			}
		};
		thread.start();
	}
	
	void stopClient() {
		try {
			Platform.runLater(() ->{
				displayText("[연결 끊음]");
				btnConn.setText("start");
				btnSend.setDisable(true);
				
			});
			if(socket!=null && !socket.isClosed()) {
				socket.close();
			}
		}catch(Exception e) {e.printStackTrace();}
	}
	
	void receive() {
		while(true) {
			byte[] byteArr = new byte[100];
			try {
				InputStream is = socket.getInputStream();
				
				//서버가 비정상적으로 종료됐을 경우 IOException발생
				int readByteCount = is.read(byteArr);
				
				if(readByteCount == -1) throw new IOException();
				
				String data = new String(byteArr, 0, readByteCount, "UTF-8");
				
				Platform.runLater(()-> displayText("[받기완료]"+data));
				
			} catch (Exception e) {
				Platform.runLater(()->displayText("[서버 통신 안됨]"));
				stopClient();
				break;
			}
		}
	}
	
	void send(String data) {
		Thread thread = new Thread() {
			@Override
			public void run() {
				try { byte[] byteArr = data.getBytes("UTF-8");
				OutputStream os = socket.getOutputStream();
				os.write(byteArr);
				Platform.runLater(()-> displayText("[보내기 완료]"));
				}catch (Exception e) {
					Platform.runLater(()->displayText("[서버 통신 안됨]"));
					stopClient();
				}
			}
		};
		thread.start();
	}
	TextArea txtDisplay;
	TextField txtInput;
	Button btnConn, btnSend;

	@Override
	public void start(Stage primaryStage) throws Exception {
		BorderPane root = new BorderPane();
		root.setPrefSize(800, 500);
		
		txtDisplay = new TextArea();
		txtDisplay.setEditable(false); //글씨가 쓰여있던 부분 수정할 수 없음
		BorderPane.setMargin(txtDisplay, new Insets(0,0,2,0));
		root.setCenter(txtDisplay);
		
		BorderPane bottom = new BorderPane();
		txtInput = new TextField();
		txtInput.setPrefSize(60, 30);
		BorderPane.setMargin(txtDisplay, new Insets(0, 1, 1, 1));
		
		btnConn = new Button("start");
		btnConn.setPrefSize(60, 30);
		btnConn.setOnAction(e -> {
			if(btnConn.getText().equals("start")) {
				startClient();
			}else if(btnConn.getText().equals("stop")) {
				stopClient();
		
			}
		});
		
		btnSend = new Button("send");
		btnSend.setPrefSize(60, 30);
		btnSend.setDisable(false);
		btnSend.setOnAction(e -> send(txtInput.getText()));
		
		bottom.setCenter(txtInput);
		bottom.setLeft(btnConn);
		bottom.setRight(btnSend);
		
		root.setBottom(bottom);
		
		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("app.css").toString());
		primaryStage.setScene(scene);
		primaryStage.setTitle("Client");
		
		primaryStage.setOnCloseRequest(event->stopClient());
		//채팅클라이언트를 우측 상단에 X표시로 종료했을떼 일어나는 명령어 지정
		primaryStage.show();
	}
	
	void displayText(String text) {
		txtDisplay.appendText(text +"\n");
		
	}
public static void main(String[] args) {
	launch(args);
}

}
