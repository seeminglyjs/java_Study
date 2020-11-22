package Anonymous.extends1;

import Generic.wildCard.Person;

public class An {
	person field = new person() {
		String studentNo;
		void work() {
			System.out.println("출근");
		}
		@Override
		void wake() {
			System.out.println("6시에 일어남");
			work();
		};
		
	};
	
	void method1() {
		person localVar = new person() {
			String studentNo;
			void walk() {
				System.out.println("산책");
			}
			@Override
			void wake() {
				System.out.println("7시에 일어남");
				walk();
			};
		};
		
		localVar.wake();
	}
	
	void method2(person person) {
		person.wake();
	}
	
}
