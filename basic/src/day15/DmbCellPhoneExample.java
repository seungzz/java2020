package day15;

public class DmbCellPhoneExample {
	public static void main(String[] args) {
		//DmbCellphone��ü����
		DmbCellPhone dmbCellPhone = new DmbCellPhone("�ڹ���", "����", 10);
		
		System.out.println("��:"+dmbCellPhone.model);
		System.out.println("����:"+dmbCellPhone.color);
		
		//DmbXellPhone�� �ʵ�
		System.out.println("ä��:"+dmbCellPhone.channel);
		
		
		//CellPhone���κ��� ��ӹ��� �޼ҵ� ȣ��
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("��������");
		dmbCellPhone.receiveVoice("�ȳ�!���� ������");
		dmbCellPhone.sendVoice("�Ƴ�~");
		dmbCellPhone.hangUP();
		
		
		//DmbCellPhone�� �޼ҵ� ȣ��
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();
	}
}
