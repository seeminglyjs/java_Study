package interface_Lambda_f;

import java.time.LocalDateTime;
import java.util.Scanner;


public class main {

	public static void main(String[] args) {	
		
		Scanner scan = new Scanner(System.in);
		
		LocalDateTime now = LocalDateTime.now();
		//������ ������ ����
		String sDat = now.getYear()+"";
		//���ڿ��� ��ȯ
		int today = Integer.parseInt(sDat);
		//���̸� ���ϱ� ���� ��Ʈ������ ��ȯ���ش�.
		
		human hu = new human() {
			@Override
			public void age() {
				System.out.println("����� �¾ ������ �����Դϱ�? ex) 2000 ");
				int year = scan.nextInt();			
				//�¾ ������ �Է¹���
				System.out.println("����� ���̴� : " + (today - year + 1) + " �� ");	
			}
			@Override
			public void name() {
				System.out.println("����� �̸���?");
				String name = scan.next();	
				System.out.println(name + " ���� ���� �̸��Դϴ�!!");
			}
		};
		
		hu.age();	
		hu.name();
	}

}
