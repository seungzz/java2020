package day29;

public class Calculator2 {
	private int memory;
	
	public int getMemory() {
		return memory;
	}
	
	public synchronized void setMemory(int memory) {	//공유 객체인 calculator2의 참조(잠금)
		this.memory = memory;
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			
	}System.out.println(Thread.currentThread().getName() + ": "+this.memory);
	}
}
