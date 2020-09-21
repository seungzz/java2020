package day25;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysCopyExample {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		char[] arr1 = {'J','A','V','A'};
		
		//방법1
		//미리 배열을 만들어두지 않아도 배열에 바로 넣을 수 있다.
		char[] arr2 = Arrays.copyOf(arr1, arr1.length);
		System.out.println("arr2="+Arrays.toString(arr2));
		
		//방법2
		char[] arr3 = Arrays.copyOfRange(arr1, 1,3);//인덱스1부터 3직전의 인덱스까지 뽑아낸다
		System.out.println(arr3);
		
		//방법3
		//배열을 미리 만들어 놓고 뽑아낸다.
		char[] arr4 = new char[arr1.length];
		System.arraycopy(arr2, 0, arr4, 0, arr1.length);
		for(int i =0; i<arr4.length; i++) {
			System.out.println("arr4["+i+"]="+arr4[i]);
			
		}
		System.out.println(arr4);
		System.out.println(Arrays.toString(arr4));
		
	}
}
