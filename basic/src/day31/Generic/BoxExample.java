package day31.Generic;

public class BoxExample {
	public static void main(String[] args) {
		Box box = new Box();
		box.set("ȫ�浿");					//String -> Object �ڵ� Ÿ�Ժ�ȯ
		String name = (String) box.get();	//add cast to string �̿�
											//Object -> String ���� Ÿ�Ժ�ȯ
		
		
		box.set(new Apple()); 		//Apple -> Object (�ڵ�Ÿ�Ժ�ȯ)
		Apple apple = (Apple) box.get();	//Object -> Apple (����Ÿ�Ժ�ȯ)
		
		
	}
}
