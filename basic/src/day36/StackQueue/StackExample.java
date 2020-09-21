package day36.StackQueue;

import java.util.Stack;

public class StackExample {
	public static void main(String[] args) {
		Stack<Coin> coinBox = new Stack<Coin>();
		
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));		//push() 메소드를 통해서 스택에 값을 넣어준다.

		while(!coinBox.isEmpty()) {
			Coin coin2 = coinBox.peek();	//peek()메소드는 꺼내지만 값을 삭제하지는 않는다.
			System.out.println("꺼내온 동전: "+coin2.getValue());
			
			Coin coin = coinBox.pop();		//pop() 메소드를 사용하면 맨위 스택에서 값을 꺼내오면서 값을 삭제.
			System.out.println("꺼내온 동전: "+coin.getValue());
		}
	}
}
