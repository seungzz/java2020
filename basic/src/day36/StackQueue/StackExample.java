package day36.StackQueue;

import java.util.Stack;

public class StackExample {
	public static void main(String[] args) {
		Stack<Coin> coinBox = new Stack<Coin>();
		
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));		//push() �޼ҵ带 ���ؼ� ���ÿ� ���� �־��ش�.

		while(!coinBox.isEmpty()) {
			Coin coin2 = coinBox.peek();	//peek()�޼ҵ�� �������� ���� ���������� �ʴ´�.
			System.out.println("������ ����: "+coin2.getValue());
			
			Coin coin = coinBox.pop();		//pop() �޼ҵ带 ����ϸ� ���� ���ÿ��� ���� �������鼭 ���� ����.
			System.out.println("������ ����: "+coin.getValue());
		}
	}
}
