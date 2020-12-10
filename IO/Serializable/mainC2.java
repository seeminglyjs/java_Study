package IO.Serializable;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class mainC2 {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("C:/Users/system888/Desktop/java1/test.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		ClassC classC = (ClassC) ois.readObject();
		System.out.println(classC.field1);
		
		ois.close();
		fis.close();
	}

}
