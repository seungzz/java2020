package day27.Calendar;

import java.util.Calendar;

public class CalendarEx4 {
	public static void main(String[] args) {
		Calendar date = Calendar.getInstance();
		date.set(2015,7,15);
		
		System.out.println(toString(date));
		System.out.println("= 1일 후=");
		date.add(Calendar.DATE,1);
		System.out.println(toString(date));
		
		System.out.println("= 6달전=");
		date.add(Calendar.MONTH, -6);
		System.out.println(toString(date));
		
		System.out.println("= 31일 후(roll) =");	//달도 달라지게 하려면 add사용하고 일 수만 달라지게 하려면 roll
		date.roll(Calendar.DATE, 31);
		
		
		
		
	}
	
	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR)+"년"+date.get(Calendar.MONTH)+1+"월"+date.get(Calendar.DATE)
		+"일";
		
		
	}	
}
