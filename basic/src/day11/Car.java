package day11;

public class Car {
	//�ʵ�
	int gas;
	//������
	
	//�޼ҵ�
	void setGas(int gas) {
		this.gas = gas;	//���� ������ �ʵ��� ����, ���� ������ �Ű������� ���� ���ο� ����
						//��ġ�� �Ǿ�� ���ظ� �ϱ� �� ����.
	}
	
	boolean isLeftGas() {
		if(gas==0) {
			System.out.println("������");
			return false;
		}
		System.out.println();
		return true;
		
	}
	void run() {
		while(true)
			if(gas>0) {
				System.out.println("�޸��ϴ�.(�ܷ�:"+gas+")");
				gas-=1;
				
				
			}
			else {
				System.out.println("����ϴ�.(�ܷ�:"+gas+")");
				return; //�޼ҵ� ���� ����
				//���ϰ��� ���̵忡�� break�� ���� ������ �Ѵ�.
			}
	}
}
