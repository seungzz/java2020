package day29.Thread.wait;

public class WaitTotifyExample {
	public static void main(String[] args) {
		WorkObject sharedObject = new WorkObject();	//傍蜡按眉积己
		
		ThreadA threadA = new ThreadA(sharedObject);	//ThreadA客 ThreadB 积己
		ThreadB threadB = new ThreadB(sharedObject);
		
		
		
		threadA.start();
		threadB.start();
		
	}
}
