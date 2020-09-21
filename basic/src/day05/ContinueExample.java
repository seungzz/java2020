package day05;

public class ContinueExample {
	public static void main(String[] args) {
		for(int i = 1; i<=10; i++) {
			if (i%2 !=0) { //2로 나눴는데 나머지가 없다 = 2의배수
				continue;	//밑의 코드를 실행하지 않고 for나 while로 돌아감
				}
			System.out.println(i);
			}
		}
	}


