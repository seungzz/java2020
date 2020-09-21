package Thread;
//runnable을 생성하지 않고 동시에 실행시킴
import java.awt.Toolkit;

public class BeepPrintExample3 {
	public static void main(String[] args) {
	
	Thread thread = new Thread(new Runnable() {
		@Override
		public void run() {
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			for(int i=0;i<5;i++) {
				toolkit.beep();
				try {Thread.sleep(500);}
				catch (Exception e) {}
			
		}
	}});
	for (int i=0;i<5;i++) {
		System.out.println("띵");	
		try {Thread.sleep(500);}
		catch (Exception e) {}
		}
	}
}
