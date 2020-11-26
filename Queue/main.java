package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class main {

	public static void main(String[] args) {
		Queue<Message> messageQueue = new LinkedList<Message>();
		
		messageQueue.offer(new Message("send", "jj"));
		messageQueue.offer(new Message("send2", "kk"));
		messageQueue.offer(new Message("send3", "hh"));
	
		while(!messageQueue.isEmpty()) {
			Message message = messageQueue.poll(); 
			switch(message.command) {
			case "send":
				System.out.println(message.to );
			case "send2":
				System.out.println(message.to );
			case "send3":
				System.out.println(message.to );
			}
		}
	
	
	}

}
