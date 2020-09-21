package day29.Thread.wait;

public class DataBox {
	private String data;
	
	public synchronized String getData() {
		if(this.data == null) {
			try {
				wait();			//null인 경우 wait
			}catch(InterruptedException e) {
				
			}
			
		}	//null이 아닌 경우 data출력한다. 
		String returnValue = data;
		System.out.println("ConsumerThread가 읽은 데이터: "+returnValue);
		data = null;		//데이터 써버렸기 때문에 데이터 비운다.
		notify();			//잠들어있던 또다른 thread를 깨워라.
		return returnValue;
	}
	
	public synchronized void setData(String data) {
		if(this.data != null) {
			try {
				wait();		//null이 아닐때 실행되지 않음
			}catch(InterruptedException e) {
			}
		}
		this.data = data;
		System.out.println("ProducerThread가 생성한 데이터: "+data);
		notify();			
	}
}
