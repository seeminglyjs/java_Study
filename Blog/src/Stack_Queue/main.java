package Stack_Queue;

import java.util.LinkedList;
import java.util.Queue;

public class main {

	public static void main(String[] args) {
//		Stack<tower> level = new Stack<>();
//		//���� ����
//		level.add(new tower(1));
//		level.add(new tower(2));
//		level.add(new tower(3));
//		level.add(new tower(4));
//	
//		while(!level.isEmpty()) {
//			tower temp = level.pop();
//			System.out.println(temp.getFloor() + " �� ���� �Ϸ�");
//			if(level.isEmpty()) {
//				System.out.println("��� �� ���� �Ϸ�");
//				break;
//			}
//		}
////////////////////////////////////////////////////////////////////////////////	
		Queue<tower> level = new LinkedList<>();
		
		level.offer(new tower(1));
		level.offer(new tower(2));
		level.offer(new tower(3));
		level.offer(new tower(4));
		level.offer(new tower(5));
		
		while(!level.isEmpty()) {
			tower temp = level.poll();
			System.out.println(temp.getFloor() + " �� ���� �Ϸ�");
			if(level.isEmpty()) {
			System.out.println("��� �� ���� �Ϸ�");
			break;
		}
		}
		
		
		
	}

}
