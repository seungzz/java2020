package StringMethod;

import java.io.UnsupportedEncodingException;

public class StringMethod {
	public static void main(String[] args) {
		String str = "Hello";
		int i =2;
		char[] c = new char[10];
		
		System.out.println("���ڿ� ���� length(): "+ str.length());
		System.out.println("���ڿ� �� i��° ���ڸ� ��ȯ: "+str.charAt(i));
		System.out.println("���ڿ��� �Ϻθ� char[]�� ����: "+c);
		str.getChars(0, str.length(), c, 1);
		
		System.out.println("���ڿ� ��, ��ҹ��� ����: "+str.equalsIgnoreCase("hello"));
		
		System.out.println("���ڿ��� 'h'�� �����϶�� ture�� ��ȯ: "+str.startsWith("h"));
		
		System.out.println("������ ���ڿ��� \"lo\"�� ������ ture�� ��ȯ�ϴ� �޼ҵ�:"+str.endsWith("lo"));
		
		System.out.println("������ ���ڿ��� ������ ���ڿ��� ���Ͽ� ������ ���ڿ��� \n" 
		+ "�񱳵� ���ڿ����� ũ�� ���,������0, ������ �������� ��ȯ: "+str.compareTo("A"));
		
		System.out.println("���� ���ڹ��� str�� ���°�� ��ġ�ϴ��� ��ȯ�ϴ� �޼ҵ�: "+str.indexOf("l"));
		
		System.out.println("���� ���ڹ��� str�� startIndex(3)����"+ "���°�� ��ġ�ϴ� �޼ҵ�: "+str.indexOf("1",3));
		
		System.out.println("���� ���ڰ� �ε����� ���������� ���Ͽ�" +"���°�� ��ġ�ϴ��� ��ȯ�ϴ� ��: "+str.lastIndexOf("1"));
		
		System.out.println("���� �ε������� ���� �ε���(-1)���� ��ȯ�ϴ� �Լ�: "+str.substring(1,3));//1����2������ ���ڿ� ��ȯ
		
		System.out.println("���յ� ���ڿ��� ��ȯ�ϴ� �޼ҵ�: "+str.concat("world"));
		
		System.out.println("�Ű������� ������ ���ڸ� �ι�° �Ű������� ������ ���ڷ� ��ü: "+str.replace("o", "ow"));
		
		System.out.println("���ڿ��� ���۰� ���� �ִ� ������ �����ϴ� �޼ҵ�: "+str.trim());
		
		System.out.println("������ ���ڸ� �ҹ��ڷ� ��ȯ�ϴ� �޼ҵ�: "+str.toLowerCase());
		
		System.out.println("������ ���ڸ� �빮�ڷ� ��ȯ�ϴ� �޼ҵ�: "+str.toUpperCase());
		
		System.out.println("�Ű������� �������� ���ڸ� �迭�� ������ �޼ҵ�: "+str.split(" "));
		
		System.out.println("���峻�� �Ű������� �־��� ���ڰ� �ִ��� true�� false�� ��ȯ�ϴ� �޼ҵ�: "+str.contains("s"));
		
		System.out.println("�־��� ���ڿ��� �ƽ�Ű �ڵ�� ��ȯ�ϴ� �޼ҵ�: "+str.getBytes());
		
		try {
			System.out.println("�־��� ���ڿ��� �ش� ���ڼ����� ��ȯ�ϴ� �޼ҵ�: "+str.getBytes("UTF-8"));
		} catch (UnsupportedEncodingException e) {
			
			e.printStackTrace();
		}
		
		System.out.println("�ش� ���ڿ��� ������� �˷��ִ� �޼ҵ�: "+str.isEmpty());
		
		System.out.println("���ڿ��� ������ ���ڰ� ������ ù��°�� ���� ������ ���ڷ� �ٲ��ִ�"+"�޼ҵ�: "+str.replaceFirst("l", "llo hel"));
		
		System.out.println("����ǥ������ ����Ͽ� ù��° �Ű������� �ش��ϴ� ���ڸ� "+"�ι��� �Ű������� �ش��ϴ� ���ڷ� ġȯ:"
		+str.replaceAll("[0-9]", " ")+ //0����9���� �������� �ٲٰڴ�.
		str.replaceAll("[^8-9]", " ")	//0-9�� ������ �������� ��ü
		+str.replaceAll("[a-z", " ")
		+str.replaceAll("[a-z|A-Z]", " ")
		+str.replaceAll("[��-��|��-��|��-�R]", " ")	//�ѱ��� �ش� ���ڿ��� ��ü
		+str.replaceAll("[^��-��|^��-��|^��-�R]", " "));	//�ѱ��� �ƴ� ��� ���ڸ� �ش� ���ڿ��� ��ü
		
		
		
				
	}
}
