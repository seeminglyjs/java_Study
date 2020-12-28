package eException;

public class main {

	public static void main(String[] args){
		
//		String str = null;
//		System.out.println(str.toString());
//		//str은 null값을 가지고 있어 String 객체가 아니기 때문에 해당 코드 실행시 NullPointerException 이 발생한다.
		
//		try {
//			String str = null;
//			System.out.println(str.toString());
//		}catch (NullPointerException e) {
//			System.out.println("--NullPointerException 발생--");
//			System.out.println("기존 코드를 체크해 주세요!!");
//		}finally {
//			System.out.println("예외처리 코드가 오류없이 진행되었습니다.");
//		}
		

/////////////////////////////////////////////////////////////////////////////////////////////////		
//		int [] arr = new int[3];		
//		for(int i = 0; i <= 3; i++) {
//			arr[i]= i;
//			//arr의 범위는 0 ~ 2 총 3개의 인덱스를 가지고 있다.
//			//arr[3] 은 존재하지 않기 때문에 인덱스 범위를 초과한
//			//ArrayIndexOutOfBoundsException가 발생한다.
//		}
		try {
			int [] arr = new int[3];		
			for(int i = 0; i <= 3; i++) {
				arr[i]= i;
			}
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("--ArrayIndexOutOfBoundsException 발생--");
			System.out.println("기존 코드를 체크해 주세요!!");
		}finally {
			System.out.println("예외처리 코드가 오류없이 진행되었습니다.");
		}

/////////////////////////////////////////////////////////////////////////////////////////////////	
		//p426
//		String str = "100";
//		String str1 = "100 ";
//		
//		int a = Integer.parseInt(str);
//		int b = Integer.parseInt(str1);
//		//공백이 포함되어 있어 예외 발생
//		//NumberFormatException
		
//		try {
//			String str = "100";
//			String str1 = "100 ";
//			
//			int a = Integer.parseInt(str);
//			int b = Integer.parseInt(str1);
//		}catch (NumberFormatException e) {
//			System.out.println("--NumberFormatException 발생--");
//			System.out.println("기존 코드를 체크해 주세요!!");
//		}finally {
//			System.out.println("예외처리 코드가 오류없이 진행되었습니다.");
//		}

/////////////////////////////////////////////////////////////////////////////////////////////////			
	}

}
