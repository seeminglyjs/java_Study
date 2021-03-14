package aa_wWriter_f;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class Main {

	public static void main(String[] args) {
		
		//https://docs.oracle.com/javase/8/docs/api/
		
		Writer wr = new OutputStreamWriter(System.out); 
		//Writer�� �߻�Ŭ�����̱� ������ �ܵ����� new �����ڷ� ��ü�� ������ �� ����.
		//�ڽ�Ŭ������ �Ű��� �޾ƾ��� ��ü������ �����ϴ�.
		//���ڿ���Ʈ���� ����ϴ� Ŭ�����̱� ������, ��Ʈ��������Ŭ���� �� System.out�� ����ȯ �ؾ��Ѵ�.
		
		
//		String str = "Hello, Hi";	
//		try {
//			wr.write(str);
//			wr.flush();
//			//writer�� ��Ʈ�� ��ü�� ���޹޾� �ٷ� ����ϴ°� �����ϴ�.	
//		} catch (IOException e) {
//			e.printStackTrace();
//		}finally {
//			try {
//				wr.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
		
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
//		String str = "Hello, Hi";
//		char [] buf = str.toCharArray();
//		// ��Ʈ���� �ɰ��� ���ڹ迭�� ����ش�
//		
//		try {
//			for(int i = 0; i < buf.length; i++) {
//				wr.write(buf[i]);
//				//writer�� ���ڹ迭�� ��ü�� �ϳ��� �޾� ���	
//			}
//			wr.flush();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}finally {
//			try {
//				wr.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
//
//		
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////		

		
		String str = "Hello, Hi";
		char [] buf = str.toCharArray();
		// ��Ʈ���� �ɰ��� ���ڹ迭�� ����ش�
		
		try {
			wr.write(buf,0, buf.length);
			//writer�� ���ڹ迭�� ������ ������ ����� ���� �ִ�.
			wr.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				wr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		
	}

}
