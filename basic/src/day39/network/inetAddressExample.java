package day39.network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class inetAddressExample {
	public static void main(String[] args) {
		try {
			InetAddress local = InetAddress.getLocalHost();
			System.out.println("�� ��ǻ�� IP�ּ�: "+local.getHostAddress());
			
			InetAddress[] iaArr = InetAddress.getAllByName("www.naver.com");
			for(InetAddress remote : iaArr) {
				System.out.println("���̹� IP�ּ�: "+remote.getHostAddress());
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
	}
}
