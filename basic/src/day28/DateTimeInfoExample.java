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
		
		String strDateTime = now.getYear() + "��";
		strDateTime += now.getMonthValue() +"��";
		strDateTime += now.getDayOfWeek() +"��";
		strDateTime += now.getDayOfWeek() +" ";
		strDateTime += now.getHour() +"��";
		strDateTime += now.getMinute() +"��";
		strDateTime += now.getSecond() +"��";
		strDateTime += now.getNano() +"������";
		System.out.println(strDateTime + "\n");
		
		LocalDate nowDate = now.toLocalDate();
		if(nowDate.isLeapYear()) {
			System.out.println("���ش� ����: 29�ϱ��� ����.");
		}else {
			System.out.println("���ش� ���: 28�ϱ��� ����.");
		}
		
		//��������ÿ� ��������
		ZonedDateTime utcDateTime = ZonedDateTime.now(ZoneId.of("UTC"));
		System.out.println("�������԰��:"+utcDateTime);
		ZonedDateTime seoulDateTime = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
		System.out.println("���� Ÿ����:"+seoulDateTime);
		
		ZoneId seulZoneId = seoulDateTime.getZone();
		System.out.println("���������̵�"+seulZoneId);
		
		ZoneOffset seulZoneOffset = seoulDateTime.getOffset();	//getOffset()�� �̿��ϸ� ������ �̾Ƴ� �� �մ�.
		System.out.println("���� ��������: "+ seulZoneOffset);
	}
}
