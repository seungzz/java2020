package day15;

public class DmbCellPhoneExample {
	public static void main(String[] args) {
		//DmbCellphone객체생성
		DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰", "검정", 10);
		
		System.out.println("모델:"+dmbCellPhone.model);
		System.out.println("색상:"+dmbCellPhone.color);
		
		//DmbXellPhone의 필드
		System.out.println("채널:"+dmbCellPhone.channel);
		
		
		//CellPhone으로부터 상속받은 메소드 호출
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("여보세요");
		dmbCellPhone.receiveVoice("안녕!나는 강승지");
		dmbCellPhone.sendVoice("아네~");
		dmbCellPhone.hangUP();
		
		
		//DmbCellPhone의 메소드 호출
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();
	}
}
