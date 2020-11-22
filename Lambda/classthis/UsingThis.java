package Lambda.classthis;

public class UsingThis {
	public int out = 10;
	
	class Inner{
		int in = 20;
		
		void method(){
			
			ifinter fi = () ->{
				System.out.println(out);
				System.out.println(UsingThis.this.out);
				//밖에 있는 out 사용
				
				System.out.println(in);
				System.out.println(this.in);
				//람다식에서의 in을 사용해버림 클래스를 표시 안해주면
			};
			fi.method();
		}
		
		
	}
	
}
