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
			System.out.println(this.getName() +"말은 현재"+ distance/100+"m입니다.");
			try {
				Thread.sleep(10);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
			if(distance >=10000) break;
			
		}
		System.out.println(this.getName() + "말 도착!!");
	}
}
public class RaceGame {
	public static void main(String[] args) {
		Hores h1 = new Hores("1번");
		Hores h2 = new Hores("2번");
		Hores h3 = new Hores("3번");
		Hores h4 = new Hores("4번");
		System.out.println("시작!");
		
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
		System.out.println("끝!");

	}
}
