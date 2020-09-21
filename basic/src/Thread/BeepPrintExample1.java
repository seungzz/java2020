package Thread;

import java.awt.Toolkit;
//소리와 띵 출력 따로 실행된다.


public class BeepPrintExample1 {
	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();	// toolkit객체얻기
		for(int i=0; i<5; i++) {
			toolkit.beep();				//비프음발생
			try {Thread.sleep(500);}
			catch (Exception e ) {
			}
			}
			for(int i = 0; i<5;i++) {
				System.out.println("띵");
				try {
					Thread.sleep(500);
				}catch(Exception e) {
					
				}
			}
			}
		}
	
