package day22;

import java.util.Objects;

public class HashCodeExample {
	
	public static void main(String[] args) {
		Studnet s1 = new Studnet(1,"ȫ�浿");
		Studnet s2 = new Studnet(1,"ȫ�浿");
		System.out.println(s1.hashCode());
		System.out.println(Objects.hashCode(s2));
	}
	
	
	
	
	
	static class Studnet {
		int sno;
		String name;
		Studnet(int sno, String name){
			this.sno = sno;
			this.name = name;
		}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(sno,name);	//���� �Ű������� ���´ٸ� ���� �ٸ� ��ü�� ���� �ؽ��ڵ� ����
	}
}
}