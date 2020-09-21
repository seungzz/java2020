package day30.ex;

import java.util.Random;

class Hores extends Thread{
	Hores(String name) {
		super(name);
	}
	int distance =0;
	public void run() {
		Random r= new Random();
		while(true) {
			distance +=10;
			System.out.println(this.getName() +"���� ����"+ distance/100+"m�Դϴ�.");
			try {
				Thread.sleep(10);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
			if(distance >=10000) break;
			
		}
		System.out.println(this.getName() + "�� ����!!");
	}
}
public class RaceGame {
	public static void main(String[] args) {
		Hores h1 = new Hores("1��");
		Hores h2 = new Hores("2��");
		Hores h3 = new Hores("3��");
		Hores h4 = new Hores("4��");
		System.out.println("����!");
		
		h1.start();
		h2.start();
		h3.start();
		h4.start();
		
		try {
			h1.join();
			h2.join();
			h3.join();
			h4.join();
		}catch (InterruptedException e ) {
			e.printStackTrace();
		}
		System.out.println("��!");

	}
}
