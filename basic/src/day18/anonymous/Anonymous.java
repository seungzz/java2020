package day18.anonymous;

public class Anonymous {
	//�ʵ� �ʱⰪ���� ����
	Person field = new Person() {	//�͸� �ڽ� ��ü ����
		void work() {
			System.out.println("���");
		}
		
		@Override
		void wake() {
			System.out.println("6�ñ��");
			work();
		}
	};
	void method1() {
		//���ú��������� ����
		Person localVar = new Person() {
			void walk() {
				System.out.println("��å");
			}
			@Override
			void wake() {
				System.out.println("7�ñ��");
				walk();
			}
		};
		
		localVar.wake();
	}
	
	void method2(Person person) {
		person.wake();
	}
}
