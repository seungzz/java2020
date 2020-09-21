package day36.StackQueue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
	public static void main(String[] args) {
		Queue<Message> messageQueue = new LinkedList<Message>();
		
		messageQueue.offer(new Message("sendMail","������"));
		messageQueue.offer(new Message("sendSMS","������"));
		messageQueue.offer(new Message("sendKaKaotalk","�ȼ���"));
		
		while(!messageQueue.isEmpty()) {
			Message message = messageQueue.poll();
			switch(message.command) {
			case "sendMail":
				System.out.println(message.to+"�Կ��� ������ �����ϴ�.");
				break;
			case "sendSMS":
				System.out.println(message.to+"�Կ��� SMS�� �����ϴ�.");
				break;
			case "sendKaKaotalk":
				System.out.println(message.to+"�Կ��� kakaotalk�� �����ϴ�.");
				break;
			
			}
		}

	}
}
