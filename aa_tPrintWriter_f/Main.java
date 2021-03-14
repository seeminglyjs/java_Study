package aa_tPrintWriter_f;
import java.io.PrintWriter;

public class Main {

	public static void main(String[] args){	
		
		PrintWriter pw = new PrintWriter(System.out);
		
		pw.println("Hello");
		pw.flush();
		
		boolean check = pw.checkError();
		System.out.println("PrintWriter 사용간 에러 발생 여부 : " + check);
	
	}

}

/////////////////////////////////////////////////////////////////////////////////////////
//package tPrintWriter;
//import java.io.PrintWriter;
//
//public class Main {
//
//	public static void main(String[] args){	
//		
//		PrintWriter pw = new PrintWriter(System.out);
//		
//		String str1 = "Hello";
//		
//		pw.print(str1);
//		pw.print(str1);
//		pw.println(); // 개행
//		pw.print(str1); // 개행뒤 아랫줄에 출력
//		pw.println(); // 개행
//		pw.printf("%.2f", Math.PI); 
//		// 소숫점 둘째 자릿까지 원주율 출력
//		pw.flush();
//
//	}
//
//}
/////////////////////////////////////////////////////////////////////////////////////////
//package tPrintWriter;
//import java.io.FileNotFoundException;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.io.PrintWriter;
//
//public class Main {
//
//	public static void main(String[] args){	
//		
//		String path = "../Blog2/src/tPrintWriter/test.txt";
//		
//		PrintWriter pw = null;
//		try {
//			pw = new PrintWriter(new FileWriter(path));
//			pw.println("Hello World");
//			
//			pw.append('+');
//			
//			pw.append(" Wow!!");
//
//			pw.flush();
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		pw.close();
//		
//	}
//
//}
