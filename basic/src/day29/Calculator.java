package day29;

public class Calculator {
	private int memory;
	public int getMemory() {
		return memory;
	}
	public void setMemory(int memory) {//���� �޸𸮿� ���� �����ϴ� �޼ҵ�
		this.memory	= memory;			//�Ű����� memory �ʵ忡 ����
		try {
			Thread.sleep(2000);	
		}catch(Exception e) {
			System.out.println(Thread.currentThread().getName()+": "+ this.memory);
		}
	}
}
