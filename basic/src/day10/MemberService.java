package day10;

public class MemberService {
	
	String s = "kang";
	String t = "12345";
	boolean result;
	
	
	
MemberService() {		//������ ���ؼ� Ư���Ͽ� �������� ���� ��� �����ڸ� ���� �ҷ����� �Ѵ�(�̰������¾Ƚᵵ����)
}	

	 boolean login(String x, String y) {
		  if (x.equals(s) && y.equals(t)) {
		
		 result= true;
		 }		
		  else 
		 result =  false;
		  
		  return result;
		
	 }

	 void logout(String x) {
		 
	 }
	
	 
}
