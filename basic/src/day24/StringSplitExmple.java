package day24;

public class StringSplitExmple {
	public static void main(String[] args) {
		String text = "ȫ�浿&������,������,���ڹ�-�ָ�ȣ";
		
		//split()�� Ư�� ���ڷ� ���ڿ��� �и��ϴ� �޼ҵ� �Դϴ�.
		String[] names = text.split("&|,|-");
		
		for(String name : names) {
			System.out.println(name);
			
		}
	}
}
