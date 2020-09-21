package day28;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;

public class DateTimeChangeExample {
	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		System.out.println("현재: "+now);
		
		LocalDateTime targetDateTime = null;
		
		
	
		targetDateTime = now.withYear(2014).withMonth(10).withDayOfMonth(1).withHour(13).withMinute(20)
	
							.withSecond(1);
		System.out.println("직접변경: "+targetDateTime);
	
	//년도상대변경
		targetDateTime = now.with(TemporalAdjusters.firstDayOfYear());
		System.out.println("이번 해의 첫 일: "+targetDateTime);
		targetDateTime = now.with(TemporalAdjusters.lastDayOfYear());
		System.out.println("이번 해의 마지막 일: "+targetDateTime);
		targetDateTime = now.with(TemporalAdjusters.firstDayOfNextYear());
		System.out.println("다음 해의 첫 일: "+targetDateTime);
		
		
	//월상대변경
		targetDateTime = now.with(TemporalAdjusters.firstDayOfMonth());
		System.out.println("이번 달의 첫 일: "+targetDateTime);
		targetDateTime = now.with(TemporalAdjusters.lastDayOfMonth());
		System.out.println("이번 달의 마지막 일: "+targetDateTime);
		targetDateTime = now.with(TemporalAdjusters.firstDayOfNextMonth());
		System.out.println("다음 달의 첫 일: "+targetDateTime);
	
		
	//요일상대변경
		targetDateTime = now.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
		System.out.println("이번 달의 첫 월요일: "+targetDateTime);
		targetDateTime = now.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
		System.out.println("돌아오는 월요일: "+targetDateTime);
		targetDateTime = now.with(TemporalAdjusters.previous(DayOfWeek.MONDAY));
		System.out.println("지난 월요일: "+targetDateTime);
	
		
	}
	
	
}
