package IO.BufferedInput;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class main {

	public static void main(String[] args) throws Exception {
		long start = 0;
		long end = 0;
		
		FileInputStream fis = new FileInputStream("C:/Users/system888/Desktop/java1/test.txt");
		start = System.currentTimeMillis();
		while(fis.read() != -1) {
			
		}
		end = System.currentTimeMillis();
		System.out.println(end - start);
		fis.close();
		
		
		FileInputStream fis1 = new FileInputStream("C:/Users/system888/Desktop/java1/test.txt");
		BufferedInputStream bf = new BufferedInputStream(fis1);
		start = System.currentTimeMillis();
		while(bf.read() != -1) {
			
		}
		end = System.currentTimeMillis();
		System.out.println(end - start);
		bf.close();
		fis1.close();
		
	}

}
