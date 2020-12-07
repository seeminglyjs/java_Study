package IO.PrintStream;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class main {

	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("C:/Users/system888/Desktop/java1/test.txt");
		PrintStream ps = new PrintStream(fos);
	
		ps.println("gdksdlkasd;");
		ps.println("gdksdlkasd;");
		ps.println("gdksdlkasd;");
		ps.println("gdksdlkasd;");
		ps.println("gdksdlkasd;");
		
		ps.flush();
		ps.close();
		fos.close();
	}

}
