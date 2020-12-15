package LambdaFunctionall;

public class Test1 {
//	p685~ 686	
	public int out = 1;
	class inside {
		int in = 0;
	
		void method() {
			func fu = ()->{
				System.out.println("out = " + out);
				System.out.println("out = " + Test1.this.out);
				System.out.println("_______________________");
				
				System.out.println("in = " + in);
				System.out.println("in = " + this.in);
			};
			fu.function1();
		}
		
	}
}
