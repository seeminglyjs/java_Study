package IO.Serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class mainParent {

	public static void main(String[] args)throws Exception {
		FileOutputStream fos = new FileOutputStream("C:/Users/system888/Desktop/java1/test.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		Child child = new Child();
		child.field1 = "AAAaaaa";
		child.field2 = "BBBbbbb";
		
		oos.writeObject(child);
		oos.flush();
		oos.close();
		fos.close();
		
		
		FileInputStream fis = new FileInputStream("C:/Users/system888/Desktop/java1/test.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Child v = (Child) ois.readObject();
		System.out.println(v.field1);
		System.out.println(v.field2);
		
		ois.close();
		fis.close();
	}

}
