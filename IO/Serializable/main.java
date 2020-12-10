package IO.Serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class main {

	public static void main(String[] args) throws Exception{
		
		
		FileOutputStream fos = new FileOutputStream("C:/Users/system888/Desktop/java1/test.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		ClassA classA = new ClassA();
		classA.field1 = 1;
		classA.field2.field1 = 2;
		classA.field3 = 3;
		classA.field4 = 4;
		
		oos.writeObject(classA);
		oos.flush();
		oos.close();
		fos.close();
		
		FileInputStream fis = new FileInputStream("C:/Users/system888/Desktop/java1/test.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		ClassA v = (ClassA)ois.readObject();
		System.out.println(v.field1);
		System.out.println(v.field2.field1);
		System.out.println(v.field3);
		System.out.println(v.field4);
	}

}
