package day23;

public class SystemEnvExample {
	public static void main(String[] args) {
		String javahome = System.getenv("JAVA_HOME");
		System.out.println("JAVA_HOME :"+javahome);
	}
}
