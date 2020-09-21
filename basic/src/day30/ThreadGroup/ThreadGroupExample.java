package day30.ThreadGroup;

public class ThreadGroupExample {
	public static void main(String[] args) {
		ThreadGroup myGroup	= new ThreadGroup("myGroup");
		//스레드 그룹 이름을 myGroup으로 생성
		
		
		//myGroup에 workThread1,workThread2추가
		WorkThread workThread1 = new WorkThread(myGroup,"workThread1");
		WorkThread workThread2 = new WorkThread(myGroup, "workThread2");
		
		workThread1.start();
		workThread2.start();
		
		System.out.println("[ main 스레드 그룹의 list() 메소드 출력 내용 ]");
		ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
		//현재 그룹의 정보를 갖고옴
		
		mainGroup.list();
		System.out.println();
		
		try {Thread.sleep(3000);} catch(InterruptedException e ) {}
		System.out.println("[myGroup 스레드 그룹의 interript() 메소드 호출]");
		myGroup.interrupt();
			
		}
	}

