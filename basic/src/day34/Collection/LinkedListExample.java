package day34.Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//인덱스 조회할때, ArrayList가훨씬 빠름
//인덱스 추가삭제할때, LinkedList가 훨씬 빠름


public class LinkedListExample {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();
		
		long startTime;
		long endTime;
		
		startTime = System.nanoTime();
		for(int i=0; i<10000; i++) {
			list1.add(0,String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList 걸린시간: "+(endTime-startTime)+" ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<10000; i++) {
			list2.add(0,String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList 걸린시간: "+(endTime-startTime)+" ns");
	}
}
