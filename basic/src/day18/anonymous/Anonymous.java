package day18.anonymous;

public class Anonymous {
	//필드 초기값으로 대입
	Person field = new Person() {	//익명 자식 객체 생성
		void work() {
			System.out.println("출근");
		}
		
		@Override
		void wake() {
			System.out.println("6시기상");
			work();
		}
	};
	void method1() {
		//로컬변수값으로 대입
		Person localVar = new Person() {
			void walk() {
				System.out.println("산책");
			}
			@Override
			void wake() {
				System.out.println("7시기상");
				walk();
			}
		};
		
		localVar.wake();
	}
	
	void method2(Person person) {
		person.wake();
	}
}
