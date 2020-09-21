package day24;

import java.util.StringTokenizer;

public class StringTokenizerExample {
	public static void main(String[] args) {
		String text = "ȫ�浿/������/������";
		
		//StringTokenizer�� ������ �ϳ��� ����Ͽ� ���ڿ��� �����ϴ� Ŭ�����̴�.
		//�����ڰ� ���� �ƹ��͵� ���� ������ " "�������� �ν�
		StringTokenizer st = new StringTokenizer(text, "/");
		int countToken = st.countTokens();
		for(int i=0; i<countToken;i++) {
			String token = st.nextToken();
			//nextToken()�� �����ִ� ��ū�� �ϳ��� ��ȯ�ϰ�, ������ ��ū�� �����Ѵ�.
			System.out.println(token);
		}System.out.println();
		
		
		
		//hasMoreTokens�� ��ū�� ������ �ִ��� �˷��ִ� �޼ҵ��̴�. �����ִٸ� true�� ��ȯ�Ѵ�.
		st = new StringTokenizer(text,"/");
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
			
		}
	}
}
