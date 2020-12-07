package IO.FileWriter;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class main {

	public static void main(String[] args) throws IOException {
		File file = new File("C:/Users/system888/Desktop/java1/test.txt");
		FileWriter fw = new FileWriter(file, true);
		fw.write("너가 바로 틀렸다!!!");
		fw.flush();
		fw.close();
		
		FileReader fr = new FileReader("C:/Users/system888/Desktop/java1/test.txt");
		
		int charNo = 0;
		char [] cArr = new char[200];
		while((charNo = fr.read(cArr)) != -1) {
			String data = new String(cArr, 0, charNo);
			System.out.println(data);
		}
		
		fr.close();
		
	}

}
