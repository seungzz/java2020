package day28;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DateTimeCompareExample {
	public static void main(String[] args) {
		LocalDateTime startDateTime = LocalDateTime.of(2023, 1,1,9,0,0);
		System.out.println("시작일: "+startDateTime);
		
		LocalDateTime endDateTime = LocalDateTime.of(2024, 3,31,18,0,0);
		System.out.println("종료일: "+ endDateTime+"\n");
		
		if(startDateTime.isBefore(endDateTime)) {
			System.out.println("진행중."+"\n");
		}else if(startDateTime.isEqual(endDateTime)) {
			System.out.println("종료합니다.");
		}else if(startDateTime.isAfter(endDateTime)) {
			System.out.println("종료했습니다.\n");
		}
		
		System.out.println("[종료까지 남은 시간]");
		long remainYear = startDateTime.until(endDateTime, ChronoUnit.YEARS);
		long remainMonth = startDateTime.until(endDateTime, ChronoUnit.MONTHS);
		long remainDays = startDateTime.until(endDateTime, ChronoUnit.DAYS);
		long remainHour = startDateTime.until(endDateTime, ChronoUnit.HOURS);
		long remainMinute = startDateTime.until(endDateTime, ChronoUnit.MINUTES);
		long remainSecond = startDateTime.until(endDateTime, ChronoUnit.SECONDS);
		
		System.out.println("남은 해: "+remainYear);
		System.out.println("남은 달: "+remainMonth);
		System.out.println("남은 일: "+remainDays);	
		System.out.println("남은 시간: "+ remainHour);
		System.out.println("남은 분: "+remainMinute);
		System.out.println("남은 초: "+ remainSecond);
		
		
		remainYear = ChronoUnit.YEARS.between(startDateTime, endDateTime);
		remainMonth = ChronoUnit.MONTHS.between(startDateTime, endDateTime);
		remainDays = ChronoUnit.DAYS.between(startDateTime, endDateTime);
		remainHour = ChronoUnit.HOURS.between(startDateTime, endDateTime);
		remainMinute = ChronoUnit.MINUTES.between(startDateTime, endDateTime);
		remainSecond = ChronoUnit.SECONDS.between(startDateTime, endDateTime);
		System.out.println();
		System.out.println("남은 해: "+remainYear);
		System.out.println("남은 달: "+remainMonth);
		System.out.println("남은 일: "+remainDays);	
		System.out.println("남은 시간: "+ remainHour);
		System.out.println("남은 분: "+remainMinute);
		System.out.println("남은 초: "+ remainSecond);
		System.out.println();
		
		System.out.println("종료까지 남은 기간");
		//period는 연,월,일 등을 나타내는 클래스입니다.
		Period period = Period.between(startDateTime.toLocalDate(), endDateTime.toLocalDate());
		System.out.println("남은기간: "+period.getYears()+"년");
		System.out.println(period.getMonths()+"달");
		System.out.println(period.getDays()+"일\n");
		//다른 결과를 출력함. 비교
		
		
		//duration은 시,분,초, 나노초를 출력하는 클래스입니다. -> LocalTime만 받는다
		Duration duration = Duration.between(startDateTime.toLocalTime(), 
				endDateTime.toLocalTime());		
		System.out.println("남은 초: "+duration.getSeconds());
		
		
		
		

		
		
	}
}
