package day15;

public class Student extends People{
	public int studentNo;
	
	public Student(String name, String ssn, int i) {
		super(name, ssn);	//�θ�����ڸ� super�� ���ؼ� ȣ��ȴ�. �θ�Ŭ������ ȣ���ϴ°�
		this.studentNo = i;
		
		
	}
}
