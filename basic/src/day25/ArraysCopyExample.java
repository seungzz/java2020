package day25;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysCopyExample {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		char[] arr1 = {'J','A','V','A'};
		
		//���1
		//�̸� �迭�� �������� �ʾƵ� �迭�� �ٷ� ���� �� �ִ�.
		char[] arr2 = Arrays.copyOf(arr1, arr1.length);
		System.out.println("arr2="+Arrays.toString(arr2));
		
		//���2
		char[] arr3 = Arrays.copyOfRange(arr1, 1,3);//�ε���1���� 3������ �ε������� �̾Ƴ���
		System.out.println(arr3);
		
		//���3
		//�迭�� �̸� ����� ���� �̾Ƴ���.
		char[] arr4 = new char[arr1.length];
		System.arraycopy(arr2, 0, arr4, 0, arr1.length);
		for(int i =0; i<arr4.length; i++) {
			System.out.println("arr4["+i+"]="+arr4[i]);
			
		}
		System.out.println(arr4);
		System.out.println(Arrays.toString(arr4));
		
	}
}
