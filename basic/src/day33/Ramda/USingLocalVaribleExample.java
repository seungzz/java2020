package day33.Ramda;

public class USingLocalVaribleExample {
	public static void main(String[] args) {
		UsingLocalVariable ulv = new UsingLocalVariable();
		ulv.method(20);
		//이렇게 람다식에서 가지고 온 값들은 final로 인해서 수정이 불가능하다.
	}
}
