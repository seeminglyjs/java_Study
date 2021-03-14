package aa_tInputStream_f;

import java.io.IOException;
import java.io.InputStream;

public class Main {

	public static void main(String[] args) {
		
		InputStream is = System.in;
		// InputStream API �󿡼� �߻� Ŭ���� �̱� ������
		// new �����ڸ� ����Ϸ��� �ڽ�Ŭ������ �޾ƾ� �Ѵ�.
//		public abstract class InputStream
//		extends Object
//		implements Closeable
//		
		
		byte [] arr = new byte [100];
		// �ֵܼ� �Էµ� �����͸� 100���� ����Ʈ����
		// ���� �� �ִ� �迭�� �����Ѵ�.
		// loop�� �ݺ� Ƚ���� �ٿ��� �ӵ��� �����ش�.
		// �ڽ��� ��ǻ�� ȯ�濡 �°� �˸��� �迭ũ�⸦
		// �����ϴ� ���� �߿��ϴ�.
		
		
		int checkByte = -1;
		// ��� �Է¹޴� �����Ͱ� �ִ��� Ȯ���� ����
		System.out.println("�����͸� �Է����ּ��� ->    ");
		try {
			while((checkByte = is.read(arr)) != -1) {
				// read �޼���� ���̻� ���� �����Ͱ� ���� ���
				// -1�� �����ϰ� �ȴ�. 
				// ������ -1�� �����ϱ� ������ �ݺ��ϸ� �ȴ�.
				String temp = new String(arr, 0, checkByte);
				System.out.println("read�� ���� �����ʹ� - > " + temp);
				// ���� String�� ���ο� ��ü�� �迭�� �迭�� ������ġ
				// ���� �Է¹��� �������� ���̸� �Ű� ������ �־� ����� �غ���.
				
				System.out.println("[ctrl + z] ������ InputStream�� ����˴ϴ�. ");
				// ctrl + z �� �Է� �ܼ�â�� �����Ű�� ����Ű��.
				// ������ ���� ���� �ٸ� �� �ִ�.
			}
		} catch (IOException e) {
		
			e.printStackTrace();
		}finally {
			try {
				System.out.println("\n�ڿ��� �ݽ��ϴ�.");
				is.close();
				// �ڿ��� ��� ����� ��
				// �ڿ��� ���� Ǯ���ֱ� ���� 
				// close�� ȣ�����ش�.
				System.out.println("\n====���α׷� ���� �Ϸ�====");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	
	
	}
	

}