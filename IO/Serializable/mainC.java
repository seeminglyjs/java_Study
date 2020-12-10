package IO.Serializable;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class mainC {

	public static void main(String[] args)throws Exception {
		FileOutputStream fos = new FileOutputStream("C:/Users/system888/Desktop/java1/test.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos); 
		
		ClassC classC = new ClassC();
		classC.field1 = 1;
		
		oos.writeObject(classC);
		oos.flush();
		oos.close();
		
		fos.close();
	}

}
