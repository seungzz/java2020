package day11;

public class Calculator4 {
	static double pi = 3.14159;	//만들자마자 고정시켜버리는 static 인스턴트는 객체를 생성 후에 사용해야하지만
								//static은 클래스가 로딩될때 바로 메모리에 넣어진다->많으면 많을수록 메모리..
								
	static int plus(int x, int y) {
	return x+y;
	
}
	static int minus(int x, int y) {
		return x-y;
	}
	
	}
