package day07;

public class ArrayReferenceObjectExample {
	public static void main(String[] args) {
		String[] strArray = new String[3];
		strArray[0] ="Java";
		strArray[1] ="Java";
		strArray[2] = new String("Java");
		//���ڲ� new�� ���ñ�? �⺻Ÿ���� new�� ���� ������ ����Ÿ��,��ü�� ��� new�� ����Ѵ�
		//->���ο� ���� ������־�� �ϱ� �����̴�
		
		
		
		System.out.println(strArray[0]==strArray[1]);
		System.out.println(strArray[1]==strArray[2]);
		System.out.println(strArray[0].contentEquals(strArray[2]));
		//�迭�� ��쵵 �Ϲ� String�� ����������(���ÿ� �ּҸ� �����ֱ� ����) .equals�� �̿��ؼ� ���ؾ� �Ѵ�.
		
	}

}
