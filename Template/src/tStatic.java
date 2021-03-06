//static 에 대한 이론 재정립 및 연습
public class tStatic {		
	static String people = "사람";
	//사람이라는 근본적인 가치는 변하지 않으며, 공통적인 특징이기 때문에 static을 선언함
	static String name = "홍길동";
	//사람이 개명을 할 수 있기 때문에 static을 선언하지 않음
	static int age = 20;
	//나이는 해가 지나면 바뀌기 때문에 static을 선언하지 않음
	
	static String basicInfo;
	//초기값이 없는 static 멤버
	static {
		basicInfo ="해당 인원의 기본 인적사항은 : " + people + " " + name + " " + age;
	}
	//static 생성자를 통해 basicInfo의 기본값을 선언해줌.
	
	void nextage(int age) {
		this.age = age;
	}
	//nextage의 경우 인스턴스 필드를 이용하기 때문에 static을 사용하지 않음
	static String hobby(String x) {
		return x;
	}
	//hobby의 경우 인스터스 필드를 사용하지 않고,
	//직접입력 받는 값을 그대로 출력하기 때문에 static 선언
}
