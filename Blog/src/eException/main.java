package eException;

public class main {

	public static void main(String[] args){
		
//		String str = null;
//		System.out.println(str.toString());
//		//str�� null���� ������ �־� String ��ü�� �ƴϱ� ������ �ش� �ڵ� ����� NullPointerException �� �߻��Ѵ�.
		
//		try {
//			String str = null;
//			System.out.println(str.toString());
//		}catch (NullPointerException e) {
//			System.out.println("--NullPointerException �߻�--");
//			System.out.println("���� �ڵ带 üũ�� �ּ���!!");
//		}finally {
//			System.out.println("����ó�� �ڵ尡 �������� ����Ǿ����ϴ�.");
//		}
		

/////////////////////////////////////////////////////////////////////////////////////////////////		
//		int [] arr = new int[3];		
//		for(int i = 0; i <= 3; i++) {
//			arr[i]= i;
//			//arr�� ������ 0 ~ 2 �� 3���� �ε����� ������ �ִ�.
//			//arr[3] �� �������� �ʱ� ������ �ε��� ������ �ʰ���
//			//ArrayIndexOutOfBoundsException�� �߻��Ѵ�.
//		}
		try {
			int [] arr = new int[3];		
			for(int i = 0; i <= 3; i++) {
				arr[i]= i;
			}
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("--ArrayIndexOutOfBoundsException �߻�--");
			System.out.println("���� �ڵ带 üũ�� �ּ���!!");
		}finally {
			System.out.println("����ó�� �ڵ尡 �������� ����Ǿ����ϴ�.");
		}

/////////////////////////////////////////////////////////////////////////////////////////////////	
		//p426
//		String str = "100";
//		String str1 = "100 ";
//		
//		int a = Integer.parseInt(str);
//		int b = Integer.parseInt(str1);
//		//������ ���ԵǾ� �־� ���� �߻�
//		//NumberFormatException
		
//		try {
//			String str = "100";
//			String str1 = "100 ";
//			
//			int a = Integer.parseInt(str);
//			int b = Integer.parseInt(str1);
//		}catch (NumberFormatException e) {
//			System.out.println("--NumberFormatException �߻�--");
//			System.out.println("���� �ڵ带 üũ�� �ּ���!!");
//		}finally {
//			System.out.println("����ó�� �ڵ尡 �������� ����Ǿ����ϴ�.");
//		}

/////////////////////////////////////////////////////////////////////////////////////////////////			
	}

}
