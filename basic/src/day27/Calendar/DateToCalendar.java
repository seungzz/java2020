package day27.Calendar;

import java.util.Calendar;
import java.util.Date;

public class DateToCalendar {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		Date d = new Date(c.getTimeInMillis());
		//calendar�� date�� ��ȯ
		
		Date d2 = new Date();
		System.out.println(d2);		
		//date�� �ѹ� �����ؼ� ����ϴ� �� ����� ����� ���� ���� ����
		
		Calendar c2 = Calendar.getInstance();
		c2.setTime(d2);
		//Date��ü�� Calendar��ü�� ��ȯ
	}
}
