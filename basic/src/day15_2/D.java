package day15_2;

import day15_1.A;	//다른 패키지에 있는것을 사용하려면 항상 import사용해야 한다. 경로를 알아야 읽기 때문

public class D extends A{
	public D() {
		super();	//부모의 생성자 실행
		this.field = "value";
		this.method();
	}
	//D는 자식이기 때문에 다른 패키지에 있어도 접근할 수 있다. 
}
