package day24;

import java.util.StringTokenizer;

public class SplitExample {
	public static void main(String[] args) {
		String str = "���̵�,�̸�,�н�����";
		
		String[] names = str.split(",");
		for(String name: names) {
			System.out.println(name);
		}
		
		
		
		
		System.out.println();
		
		StringTokenizer st = new StringTokenizer(str,",");
		while(st.hasMoreElements()) {
			String token = st.nextToken();
			System.out.println(token);
		}
		
	}
}
