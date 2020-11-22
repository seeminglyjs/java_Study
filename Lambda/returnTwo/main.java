package Lambda.returnTwo;

public class main {

	public static void main(String[] args) {
		finter fi = (x, y) ->{
			int result = x + y;
			System.out.println(result);
			return result;
		};
		
		fi.method(5, 10);
		
		fi = (x, y) -> { return x + y; };
		System.out.println(fi.method(10, 5));
	
		fi = (x,y) -> x + y;
		System.out.println(fi.method(10, 5));
	
	
	}
	
		
	
}
