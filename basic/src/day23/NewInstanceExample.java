package day23;

public class NewInstanceExample {
	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("day23.SendAction");	//��ü�� �θ���.
			Class clazz2 = Class.forName("day23.ReceiveAction");
			Action action = (Action) clazz.newInstance();	//new�� ��ü ����°Ͱ� ���� ����ϴ�.
			Action action2 = (Action) clazz2.newInstance();	//action���� ��������ȯ�ص� �������̽��̱� ������ ����
			action.execute();   		
			action2.execute();//���� ���ϴ´�� ����ȴ�. 
		}catch(ClassNotFoundException e) {
			
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
