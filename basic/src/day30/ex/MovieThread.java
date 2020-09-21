package day30.ex;

public class MovieThread extends Thread{
	
	@Override
	public void run() {
		while(true)	 {
			System.out.println("동영상을 재생합니다.");
			if(Thread.interrupted()) {
				break;
			}
		}
		System.out.println("동영상 종료");
	}
	
}
