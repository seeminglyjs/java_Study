package Anonymous.extends1;

public class main {

	public static void main(String[] args) {
		An an = new An();
		an.field.wake();
		//�ڽ� ��ü���� �������̵� �� �޼ҵ尡 ȣ���
		
		an.method1();
		
		an.method2(new person() {
			String studentNo;
			void study() {
				System.out.println("����");
			}
			@Override
			void wake() {
				System.out.println("9�ÿ� �Ͼ");
				study();
			}
		});
	}

}
