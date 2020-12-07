package IO.InputStreamReader;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class main {

	public static void main(String[] args) throws Exception {
		InputStream is = System.in;
		Reader reader = new InputStreamReader(is);
		
		int readCharNo;
		char [] cArr = new char[100];
		while((readCharNo = reader.read(cArr)) != -1) {
			String data = new String(cArr, 0, readCharNo);
			System.out.println(data);
		}
		
		
		reader.close();
		is.close();
	}

}
