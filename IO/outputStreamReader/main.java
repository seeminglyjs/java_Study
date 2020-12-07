package IO.outputStreamReader;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class main {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos =  new FileOutputStream("C:/Users/system888/Desktop/java1/test.txt"); 
		Writer writer = new OutputStreamWriter(fos);
		
		String data = "This byte data -> String";
		
		writer.write(data);
		writer.flush();
		writer.close();
		fos.close();
		System.out.println(data);
	}

}
