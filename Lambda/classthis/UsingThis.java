package Lambda.classthis;

public class UsingThis {
	public int out = 10;
	
	class Inner{
		int in = 20;
		
		void method(){
			
			ifinter fi = () ->{
				System.out.println(out);
				System.out.println(UsingThis.this.out);
				//�ۿ� �ִ� out ���
				
				System.out.println(in);
				System.out.println(this.in);
				//���ٽĿ����� in�� ����ع��� Ŭ������ ǥ�� �����ָ�
			};
			fi.method();
		}
		
		
	}
	
}
