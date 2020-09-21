package day23;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionExample {
	public static void main(String[] args) throws Exception{
		Class clazz = Class.forName("day23.Car");
		
		System.out.println("클래스이름");
		System.out.println(clazz.getName());
		System.out.println();
		
		System.out.println("생성자 정보");
		Constructor[] constructors = clazz.getDeclaredConstructors();
		for(Constructor constructor : constructors) {
			System.out.println(constructor.getName()+"(");
			Class[] parameters = constructor.getParameterTypes();
			printParameters(parameters);
			System.out.println(")");
			
		}
		System.out.println();
		System.out.println("[필드정보]");
		Field[] fields = clazz.getDeclaredFields();		//선언된 필드를 불러온다.
		for(Field field : fields) {
			System.out.println(field.getType().getSimpleName()+" "+ field.getName());
							//getType()만 썼을 경우 java.lang.String으로 나온다. simple붙이면String으로만
		}
		System.out.println();
		
		System.out.println("[메소드정보]");
		Method[] methods = clazz.getDeclaredMethods();
		for(Method method : methods) {
			System.out.println(method.getName() +"(");
			Class[] parameters = method.getParameterTypes();
			printParameters(parameters);
			System.out.println(")");
		}
		
	}
	
	private static void printParameters(Class[] parameters) {
		for(int i =0; i<parameters.length; i++) {
			System.out.println(parameters[i].getName());	//parameter이름들을 .getName()으로 뽑아냄
			if(i<parameters.length-1 ) {
				System.out.println(",");
			}
		}
	}
}
