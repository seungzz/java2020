package day23;

public class NewInstanceExample {
	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("day23.SendAction");	//객체를 부른다.
			Class clazz2 = Class.forName("day23.ReceiveAction");
			Action action = (Action) clazz.newInstance();	//new로 객체 만드는것과 거의 흡사하다.
			Action action2 = (Action) clazz2.newInstance();	//action으로 강제형변환해도 인터페이스이기 때문에 가능
			action.execute();   		
			action2.execute();//내가 원하는대로 실행된다. 
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
