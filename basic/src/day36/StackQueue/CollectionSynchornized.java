package day36.StackQueue;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;


public class CollectionSynchornized {
	public static void main(String[] args) {
		
		List<String> list = Collections.synchronizedList(new ArrayList<String>());
		
		Set<String> set = Collections.synchronizedSet(new HashSet<String>());
		//일반적인 Hashset을 동기화된 형태로 반환하는 메소드
		
		Map<String, String> map
		=Collections.synchronizedMap(new HashMap<String,String>());
		//일반적인 HashMap을 동기화된 형태로 반환하는 메소드
		
		Map<String, String> map2 = new ConcurrentHashMap<String, String>();
		//ConcurrentHashMap을 사용하면 스레드에 연산하면서도 멀티 스레드가 요소를 한꺼번에 처리 가능.
		
		Queue<String> queue = new ConcurrentLinkedQueue<String>();
		//잠금을 사용하지 않고 최소한 하나의 스레드가 안전하게 요소를 저장하거나 얻게 해줌.
	}
}
