package day28.Format.ex;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePrintExample {
public static void main(String[] args) {
	Date now = new Date();
	
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� E���� K�� m��");
	System.out.println(sdf.format(now));
	
}
}
