package day22;

import java.util.Objects;

public class toStringExample {
	public static void main(String[] args) {
		String str1 = "강승지";
		String str2 = null;
		System.out.println(Objects.toString(str1));
		System.out.println(Objects.toString(str2));
		System.out.println(str2);
		System.out.println(Objects.toString(str2,"이름이 없습니다."));
		//null일 경우 뒤의 메세지를 출력하게 된다.
		//objects.밑의 것은 스테틱이다. object는 인스턴스
	}
}
