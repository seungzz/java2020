package day22;

import java.util.Objects;

public class toStringExample {
	public static void main(String[] args) {
		String str1 = "������";
		String str2 = null;
		System.out.println(Objects.toString(str1));
		System.out.println(Objects.toString(str2));
		System.out.println(str2);
		System.out.println(Objects.toString(str2,"�̸��� �����ϴ�."));
		//null�� ��� ���� �޼����� ����ϰ� �ȴ�.
		//objects.���� ���� ����ƽ�̴�. object�� �ν��Ͻ�
	}
}
