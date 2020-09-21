package day34.Collection;

import java.util.Arrays;
import java.util.List;

public class ArraysAsListExample {
	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("홍길동","강승지","이은주");
		//List<String> list1 = Arrays.asList()
		//String을 고정 객체로 갖는 ArrayList객체생성
		
		for(String name : list1) {
			System.out.println(name);
		}
		
		for(int i=0; i<list1.size(); i++) {
			System.out.println(list1.get(i));
			//배열에서는list1[i]로 빼내왔지만 list1.get()으로 하나씩 뺼 수 있다.
		}
		
		
		List<Integer> list2 = Arrays.asList(1,2,3);
		for(int value : list2) {
			System.out.println(value);
			
		}
		for(int i=0; i<list2.size(); i++) {
			System.out.println(list2.get(i));
		}
	}
}
