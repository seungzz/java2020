package day27.Calendar;

import java.util.Calendar;
import java.util.Date;

public class DateToCalendar {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		Date d = new Date(c.getTimeInMillis());
		//calendar를 date로 변환
		
		Date d2 = new Date();
		System.out.println(d2);		
		//date는 한번 생성해서 사용하는 일 말고는 사용할 일이 별로 없음
		
		Calendar c2 = Calendar.getInstance();
		c2.setTime(d2);
		//Date객체를 Calendar객체로 변환
	}
}
