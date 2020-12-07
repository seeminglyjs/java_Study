package IO.dataStream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class main {

	public static void main(String[] args) throws Exception{
		FileOutputStream fos = new FileOutputStream("C:/Users/system888/Desktop/java1/test.txt");
		DataOutputStream dos = new DataOutputStream(fos);
		
		dos.writeUTF("Ȧ�浿");
		dos.writeDouble(3.678);
		dos.writeInt(10);
		
		dos.flush();
		dos.close();
		
		
		FileInputStream fis = new FileInputStream("C:/Users/system888/Desktop/java1/test.txt");
		DataInputStream dis = new DataInputStream(fis);
		
		String name = dis.readUTF();
		double score = dis.readDouble();
		int order = dis.readInt();
		
		System.out.println(name + score + " " +order);
		dis.close();
		fis.close();
		
	}

}
