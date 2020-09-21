package day28;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class DateTimeInfoExample {
	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		
		String strDateTime = now.getYear() + "년";
		strDateTime += now.getMonthValue() +"월";
		strDateTime += now.getDayOfWeek() +"일";
		strDateTime += now.getDayOfWeek() +" ";
		strDateTime += now.getHour() +"시";
		strDateTime += now.getMinute() +"분";
		strDateTime += now.getSecond() +"초";
		strDateTime += now.getNano() +"나노초";
		System.out.println(strDateTime + "\n");
		
		LocalDate nowDate = now.toLocalDate();
		if(nowDate.isLeapYear()) {
			System.out.println("올해는 윤년: 29일까지 있음.");
		}else {
			System.out.println("올해는 평년: 28일까지 있음.");
		}
		
		//협정세계시와 존오프셋
		ZonedDateTime utcDateTime = ZonedDateTime.now(ZoneId.of("UTC"));
		System.out.println("협정세게계시:"+utcDateTime);
		ZonedDateTime seoulDateTime = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
		System.out.println("서울 타임좀:"+seoulDateTime);
		
		ZoneId seulZoneId = seoulDateTime.getZone();
		System.out.println("서울존아이디"+seulZoneId);
		
		ZoneOffset seulZoneOffset = seoulDateTime.getOffset();	//getOffset()을 이용하면 시차를 뽑아낼 수 잇다.
		System.out.println("서울 존오프셋: "+ seulZoneOffset);
	}
}
