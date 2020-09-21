package day36.StackQueue;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;


public class CollectionSynchornized {
	public static void main(String[] args) {
		
		List<String> list = Collections.synchronizedList(new ArrayList<String>());
		
		Set<String> set = Collections.synchronizedSet(new HashSet<String>());
		//�Ϲ����� Hashset�� ����ȭ�� ���·� ��ȯ�ϴ� �޼ҵ�
		
		Map<String, String> map
		=Collections.synchronizedMap(new HashMap<String,String>());
		//�Ϲ����� HashMap�� ����ȭ�� ���·� ��ȯ�ϴ� �޼ҵ�
		
		Map<String, String> map2 = new ConcurrentHashMap<String, String>();
		//ConcurrentHashMap�� ����ϸ� �����忡 �����ϸ鼭�� ��Ƽ �����尡 ��Ҹ� �Ѳ����� ó�� ����.
		
		Queue<String> queue = new ConcurrentLinkedQueue<String>();
		//����� ������� �ʰ� �ּ��� �ϳ��� �����尡 �����ϰ� ��Ҹ� �����ϰų� ��� ����.
	}
}
