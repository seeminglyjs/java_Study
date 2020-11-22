package Lambda.basic;

public class main {

	public static void main(String[] args) {
/*		finter fi = () ->{
			System.out.println("hello");
		};
		//인터페이스의 추상메소드를 람다식으로 재정의
		fi.method();
	
		fi = () ->{
			System.out.println("hello2");
		};
		fi.method();
	
	
		fi = () ->{
			System.out.println("hello3");
		};
		fi.method();
	}*/
	
		finter2 fi = (x) ->{
			int result = x * 5;
			System.out.println(result);		
		};
	
		fi.method(2);
		
		fi = (x) ->{
			System.out.println(x * 5);		
		};
		
		fi.method(2);
		
		
		
	}	

}
