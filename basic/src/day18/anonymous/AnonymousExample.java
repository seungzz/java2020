package day18.anonymous;

public class AnonymousExample {
	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		//�͸�ü�ʵ���
		anony.field.wake();
		//�͸�ü���ú������
		anony.method1();
		//�͸�ü�Ű������
		anony.method2(new Person() {
			void study() {
				System.out.println("����");
			}
			
			void wake() {
				System.out.println("8�ñ��");
				study();
			}
		}); 
	}
}
