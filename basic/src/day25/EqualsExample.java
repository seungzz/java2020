package day25;

import java.util.Arrays;

public class EqualsExample {
	public static void main(String[] args) {
		int[][] original = { {1,2},{3,4}};
		
		//얕은 복사 후 비교
		System.out.println("[얕은복사후비교]");
		int[][] cloned1 = Arrays.copyOf(original, original.length);
		System.out.println("배열번지비교: "+original.equals(cloned1));
		System.out.println("1차배열항목값비교 : "+Arrays.equals(original, cloned1));
		System.out.println("중첩배열항목값비교: "+Arrays.deepEquals(original, cloned1));
		
		//깊은 복사 후 비교
		System.out.println("\n[깊은복사후비교]");
		int[][] cloned2 = Arrays.copyOf(original, original.length);
		cloned2[0] = Arrays.copyOf(original[0], original[0].length);
		cloned2[1] = Arrays.copyOf(original[1], original[1].length);
		System.out.println("배열번지비교: "+original.equals(cloned1));
		System.out.println("1차배열항목값비교: "+Arrays.equals(original, cloned2));
		System.out.println("중첩배열항목값비교: "+Arrays.deepEquals(original, cloned2));
	}
}
