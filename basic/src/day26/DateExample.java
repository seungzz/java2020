package day26;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {
	public static void main(String[] args) {
		Date now = new Date();
		String strNow1 = now.toString();
		System.out.println(strNow1);
		//Date객체를 String에 넣기 위해서는 toSting()메소드를 사용해야 한다.
		//String strnow3 = now; //사용불가
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초"	);
		String strNow2 = sdf.format(now);
		System.out.println(strNow2);
	}
}
