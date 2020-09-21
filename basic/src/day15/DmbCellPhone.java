package day15;


public class DmbCellPhone extends CellPhone	{
	//필드
	int channel;
	
	//생성자
	DmbCellPhone(String model, String color, int channel) {
		this.model = model;   //this를 이용해서 부모가 갖고있는 필드를 불러왔다.
		this.color = color;
		this.channel = channel;
		
	}

	
	//메소드
	void turnOnDmb() {
		System.out.println("채널" + channel +"번 DMB방송 수신을 시작합니다");
	}
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널"+channel+"번으로 바꾼다.");
	}
	
	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 멈춘다.");
	}
}
