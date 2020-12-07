package IO.BufferedOutPut;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class main {

	public static void main(String[] args) throws Exception{
		FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedInputStream bis= null;
		BufferedOutputStream bos = null;
		
		int data = -1;
		long start = 0;
		long end = 0;
		
		fis = new FileInputStream("C:/Users/system888/Desktop/java1/test.txt");
		bis = new BufferedInputStream(fis);
		fos = new FileOutputStream("C:/Users/system888/Desktop/java1/test.txt");
		start = System.currentTimeMillis();
		while((data = bis.read()) != -1) {
			fos.write(data);
		}
		fos.flush();
		end = System.currentTimeMillis();
		fos.close();
		bis.close();
		fis.close();
		System.out.println("No buffer : " + (end - start));
		
		
		fis = new FileInputStream("C:/Users/system888/Desktop/java1/test.txt");
		bis = new BufferedInputStream(fis);
		fos = new FileOutputStream("C:/Users/system888/Desktop/java1/test.txt");
		bos = new BufferedOutputStream(fos);
		start = System.currentTimeMillis();
		while((data = bis.read()) != -1) {
			bos.write(data);
		}
		fos.flush();
		end = System.currentTimeMillis();
		bos.close();
		fos.close();
		bis.close();
		fis.close();
		System.out.println("Yes buffer : " + (end - start));
	}

}
