package day26;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {
	public static void main(String[] args) {
		Date now = new Date();
		String strNow1 = now.toString();
		System.out.println(strNow1);
		//Date��ü�� String�� �ֱ� ���ؼ��� toSting()�޼ҵ带 ����ؾ� �Ѵ�.
		//String strnow3 = now; //���Ұ�
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� hh�� mm�� ss��"	);
		String strNow2 = sdf.format(now);
		System.out.println(strNow2);
	}
}