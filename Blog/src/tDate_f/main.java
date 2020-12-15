package tDate_f;

import java.util.Date;
import java.text.SimpleDateFormat;

public class main {

	public static void main(String[] args) {
		Date day = new Date();
		System.out.println(day);
		//현재날짜 / 시간ㅇ을 출력할 수 있음
		//문자열을로 바꾸고 싶으면 String 객체에 toString으로 담아주면됨.
		
		SimpleDateFormat fDay = new SimpleDateFormat("오늘의 날짜와 시간은 yyyy년 MM월 dd일 E요일 hh시 mm분 ss초입니다.");
		String sfDay = fDay.format(day);
		System.out.println(sfDay);
		//자신만의 원하는 포맷을 원할경우 위에처럼 변경할수 있음
	}

}
