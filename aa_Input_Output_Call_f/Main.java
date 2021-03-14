package aa_Input_Output_Call_f;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Main {

	public static void main(String[] args) {
		
		InputStream is = System.in;
		OutputStream os = System.out;
	
		byte [] checkByte = new byte [100];
		int size = -1;
		// �Էµ� �����Ͱ� ���̻� �ִ��� ���θ� üũ��
		// size ���� -1�� ��� �� �̻��� �����Ͱ� ����. 
		
		System.out.println("�����͸� �Է����ּ��� ->  ");
		try {
			while((size = is.read(checkByte)) != -1) {
				System.out.println("\n== �Էµ� �����ʹ� �Ʒ��� �����ϴ�.==");
				os.write(checkByte, 0, size);
				// String ��ü�� ���� �ʿ� ���� �ٷ� ������ָ� �ȴ�.
				// �� ���� �Էµ� ���ڿ��� ���̸�ŭ�� ����ؾ�
				// ���ϴ� ����� ���� �� �ִ�.
				os.flush();
				// ��� �ִ� ���۸� ����ش�.
				// ������� ������ �迭�� �����ִ� ���鹮�ڰ� �����ְԵȴ�.
				
				System.out.println("\n[ctrl + z] ������ InputStream�� ����˴ϴ�. ");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				is.close();
				os.close();
				// �ڿ��� ����� ������ �ݾ������ν�
				// Ǯ���ش�.
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	
	}

}
