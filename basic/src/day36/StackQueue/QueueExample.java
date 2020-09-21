package day36.StackQueue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
	public static void main(String[] args) {
		Queue<Message> messageQueue = new LinkedList<Message>();
		
		messageQueue.offer(new Message("sendMail","이은주"));
		messageQueue.offer(new Message("sendSMS","강승지"));
		messageQueue.offer(new Message("sendKaKaotalk","안선준"));
		
		while(!messageQueue.isEmpty()) {
			Message message = messageQueue.poll();
			switch(message.command) {
			case "sendMail":
				System.out.println(message.to+"님에게 메일을 보냅니다.");
				break;
			case "sendSMS":
				System.out.println(message.to+"님에게 SMS를 보냅니다.");
				break;
			case "sendKaKaotalk":
				System.out.println(message.to+"님에게 kakaotalk을 보냅니다.");
				break;
			
			}
		}

	}
}
