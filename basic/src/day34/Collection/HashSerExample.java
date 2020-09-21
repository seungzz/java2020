package day34.Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSerExample {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("java");	//중복저장
		set.add("iBATIS");
		
		int size = set.size();
		System.out.println("총 객체수: "+size);
		//set을 통해 반복자 얻기, 반복자는 set의 정보를 갖고 있다.
		//반복자는 일회용이다. 한번 빼내고 나면 남는게 없음
		
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t"+element);
		}
		set.remove("JDBC");
		set.remove("iBATIS");
		
		System.out.println("총 객체수: "+ size);
		
		iterator = set.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t"+element);
		}
	}
}
