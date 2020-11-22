package Lambda.Local;

public class UsingLocalVariable {
	void method(int arg) {// arg는 final의 특성을 가짐
		int localVar = 40;
	
	
	finter fi = () ->{
		System.out.println(arg);
		System.out.println(localVar);
	};
		fi.method();
	}
}
