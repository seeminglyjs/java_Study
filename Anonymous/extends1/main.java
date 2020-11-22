package Anonymous.extends1;

public class main {

	public static void main(String[] args) {
		An an = new An();
		an.field.wake();
		//자식 객체에서 오버라이딩 된 메소드가 호출됨
		
		an.method1();
		
		an.method2(new person() {
			String studentNo;
			void study() {
				System.out.println("공부");
			}
			@Override
			void wake() {
				System.out.println("9시에 일어남");
				study();
			}
		});
	}

}
