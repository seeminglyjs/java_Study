package Lambda.Local;

public class UsingLocalVariable {
	void method(int arg) {// arg�� final�� Ư���� ����
		int localVar = 40;
	
	
	finter fi = () ->{
		System.out.println(arg);
		System.out.println(localVar);
	};
		fi.method();
	}
}
