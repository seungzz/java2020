package day33.Ramda;

public class MyFunctionalInterface3Example {
	public static void main(String[] args) {
		MyFunctionalInterface3 fi;
		fi = (x,y) -> {
			int result = x+y;
			return result;
		};
		
		System.out.println(fi.method(2, 5));
		fi = (x,y) -> {
			return x+y;
		};
		System.out.println(fi.method(2, 5));
		
		fi = (x,y) -> x+y;
		//람다식에 들어갈 내요이 return값 한개라면 return을 생략할 수 있습니다.
		System.out.println(fi.method(2, 5));
		
		fi = (x,y) -> sum(x,y);
		System.out.println(fi.method(2, 5));
	}
	public static int sum(int x, int y) {
		return (x+y);
	}
}
