package day05;

public class BreakOutterExample {
	public static void main(String[] args) {
		outter : for(char upper = 'A';upper<='Z'; upper++) {
			//�ƽ�Ű�ڵ尡 Z�� ������������ for���� ������.
			for(char lower ='a'; lower<='z';lower++) {
				System.out.println(upper+"-"+lower);
				
				if(lower=='g') {
					break outter;   //g�� ������ outter��  ������Ű�ڴ�
				}
			}
		}
	System.out.println("����");
	}

}
