package IO.FileReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class main {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("C:/Users/system888/Desktop/java1/test.txt");

		int readCharNo;
		char[] cArr = new char[100];
		while((readCharNo = fr.read(cArr)) != -1) {
			String data = new String(cArr, 0, readCharNo);

			System.out.println(data);
		}
		
		fr.close();
		
		
	}

}
