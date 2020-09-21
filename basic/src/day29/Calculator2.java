package day29;

public class Calculator2 {
	private int memory;
	
	public int getMemory() {
		return memory;
	}
	
	public synchronized void setMemory(int memory) {	//���� ��ü�� calculator2�� ����(���)
		this.memory = memory;
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			
	}System.out.println(Thread.currentThread().getName() + ": "+this.memory);
	}
}
