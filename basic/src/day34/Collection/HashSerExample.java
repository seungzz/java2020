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
		set.add("java");	//�ߺ�����
		set.add("iBATIS");
		
		int size = set.size();
		System.out.println("�� ��ü��: "+size);
		//set�� ���� �ݺ��� ���, �ݺ��ڴ� set�� ������ ���� �ִ�.
		//�ݺ��ڴ� ��ȸ���̴�. �ѹ� ������ ���� ���°� ����
		
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t"+element);
		}
		set.remove("JDBC");
		set.remove("iBATIS");
		
		System.out.println("�� ��ü��: "+ size);
		
		iterator = set.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t"+element);
		}
	}
}
