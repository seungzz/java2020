package day07;

public class EnumMethodExample {
	public static void main(String[] args) {
		//name()메소드
		Week today = Week.SUNDAY;
		String name = today.name();
		System.out.println(name);
				//ordinal 메소드
		int ordinal = today.ordinal();
		System.out.println(ordinal);
		
		//coperaTo() 메소드
		Week day1 = Week.MONDAY;
		Week day2 = Week.TUESDAY;
		Week day3 = Week.WEDNESDAY;
		Week day4 = Week.THURSDAY;
		Week day5 = Week.FRIDAY;
		Week day6 = Week.SATURDAY;
		int result1 = day1.compareTo(day2);
		int result2 = day2.compareTo(day1);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println();
		
		//valueOf()	메소드
		if(args.length ==1) {
			String StrDay = args[0];
			Week weekDay = Week.valueOf(StrDay);
			if(weekDay == Week.SATURDAY || weekDay == Week.SUNDAY) {
				System.out.println("주말");
		
			}else {
				System.out.println("평일");
				System.out.println();
			}
		}
		//valus()메소드
		Week[] days = Week.values();
		for(Week day : days) {
			System.out.println(day);
		}
	}

}
