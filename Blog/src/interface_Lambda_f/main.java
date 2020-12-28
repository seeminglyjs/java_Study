package interface_Lambda_f;

import java.time.LocalDateTime;
import java.util.Scanner;


public class main {

	public static void main(String[] args) {	
		
		Scanner scan = new Scanner(System.in);
		
		LocalDateTime now = LocalDateTime.now();
		//오늘의 연도를 얻음
		String sDat = now.getYear()+"";
		//문자열로 변환
		int today = Integer.parseInt(sDat);
		//나이를 구하기 위해 인트형으로 변환해준다.
		
		human hu = new human() {
			@Override
			public void age() {
				System.out.println("당신의 태어난 연도는 언제입니까? ex) 2000 ");
				int year = scan.nextInt();			
				//태어난 연도를 입력받음
				System.out.println("당신의 나이는 : " + (today - year + 1) + " 세 ");	
			}
			@Override
			public void name() {
				System.out.println("당신의 이름은?");
				String name = scan.next();	
				System.out.println(name + " 정말 멋진 이름입니다!!");
			}
		};
		
		hu.age();	
		hu.name();
	}

}
