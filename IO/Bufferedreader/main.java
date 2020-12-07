package IO.Bufferedreader;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class main {
	public static void main(String[] args) throws Exception {
		InputStream is = System.in;
		Reader reader = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(reader);
		
		System.out.println("Input : ");
		String line = br.readLine();
		System.out.println("outPut : " + line);
		
		br.close();
		reader.close();
		is.close();
		
	}
}
