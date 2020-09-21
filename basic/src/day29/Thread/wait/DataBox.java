package day29.Thread.wait;

public class DataBox {
	private String data;
	
	public synchronized String getData() {
		if(this.data == null) {
			try {
				wait();			//null�� ��� wait
			}catch(InterruptedException e) {
				
			}
			
		}	//null�� �ƴ� ��� data����Ѵ�. 
		String returnValue = data;
		System.out.println("ConsumerThread�� ���� ������: "+returnValue);
		data = null;		//������ ����ȱ� ������ ������ ����.
		notify();			//�����ִ� �Ǵٸ� thread�� ������.
		return returnValue;
	}
	
	public synchronized void setData(String data) {
		if(this.data != null) {
			try {
				wait();		//null�� �ƴҶ� ������� ����
			}catch(InterruptedException e) {
			}
		}
		this.data = data;
		System.out.println("ProducerThread�� ������ ������: "+data);
		notify();			
	}
}
