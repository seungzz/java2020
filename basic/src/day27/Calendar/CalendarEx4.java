package day27.Calendar;

import java.util.Calendar;

public class CalendarEx4 {
	public static void main(String[] args) {
		Calendar date = Calendar.getInstance();
		date.set(2015,7,15);
		
		System.out.println(toString(date));
		System.out.println("= 1�� ��=");
		date.add(Calendar.DATE,1);
		System.out.println(toString(date));
		
		System.out.println("= 6����=");
		date.add(Calendar.MONTH, -6);
		System.out.println(toString(date));
		
		System.out.println("= 31�� ��(roll) =");	//�޵� �޶����� �Ϸ��� add����ϰ� �� ���� �޶����� �Ϸ��� roll
		date.roll(Calendar.DATE, 31);
		
		
		
		
	}
	
	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR)+"��"+date.get(Calendar.MONTH)+1+"��"+date.get(Calendar.DATE)
		+"��";
		
		
	}	
}