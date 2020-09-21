package day10;

public class MemberService {
	
	String s = "kang";
	String t = "12345";
	boolean result;
	
	
	
MemberService() {		//변수를 위해서 특정하여 선언하지 않을 경우 생성자를 먼저 불러내야 한다(이곳에서는안써도가능)
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
