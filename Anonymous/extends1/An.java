package Anonymous.extends1;

import Generic.wildCard.Person;

public class An {
	person field = new person() {
		String studentNo;
		void work() {
			System.out.println("���");
		}
		@Override
		void wake() {
			System.out.println("6�ÿ� �Ͼ");
			work();
		};
		
	};
	
	void method1() {
		person localVar = new person() {
			String studentNo;
			void walk() {
				System.out.println("��å");
			}
			@Override
			void wake() {
				System.out.println("7�ÿ� �Ͼ");
				walk();
			};
		};
		
		localVar.wake();
	}
	
	void method2(person person) {
		person.wake();
	}
	
}
