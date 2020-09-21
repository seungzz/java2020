package day39.network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class inetAddressExample {
	public static void main(String[] args) {
		try {
			InetAddress local = InetAddress.getLocalHost();
			System.out.println("내 컴퓨터 IP주소: "+local.getHostAddress());
			
			InetAddress[] iaArr = InetAddress.getAllByName("www.naver.com");
			for(InetAddress remote : iaArr) {
				System.out.println("네이버 IP주소: "+remote.getHostAddress());
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
	}
}
