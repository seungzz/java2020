package day37.IO;

import java.io.OutputStream;
import java.io.PrintStream;

public class SystemOutExample {
	public static void main(String[] args) throws Exception{
		OutputStream os = System.out;
		for(byte b =48; b<58; b++) {	//�ƽ�Ű�ڵ� 48=0
			os.write(b);
		}
		os.write(10);		//�����ǵ带 ����ϸ� ���� ������ �Ѿ
		
		for(byte b =97; b<123; b++) {
			os.write(b);
		}
		os.write(10);
		String hangul = "�����ٶ󸶹ٻ������īŸ����";
		byte[] hangulBytes = hangul.getBytes();
		//�ѱ��� 2����Ʋ ǥ�õǱ� ������
		//1����Ʈ�� ���� �� ��� ����Ʈ �迭�� �ѱ��� �޾���.
		os.write(hangulBytes);
		
		os.flush();		//�����ִ� ������ ��µȴ�.
		
		PrintStream ps = System.out;//
		ps.println("...");			// �� ������  System.out.println("...");�� ����.
	}
}
