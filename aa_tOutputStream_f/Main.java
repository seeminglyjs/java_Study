package aa_tOutputStream_f;

import java.io.IOException;
import java.io.OutputStream;

public class Main {

	public static void main(String[] args) {
		OutputStream os = System.out;
//		public abstract class OutputStream
//		extends Object
//		implements Closeable, Flushable
//		�ڹ� API �󿡵� ���� �ֵ��� �߻� Ŭ����
//		�̱� ������ ��ü������ new �����ڸ� ����� �� ����.
//		new �������� ����� ���� ��� �ڽ�Ŭ������ ������ �ȴ�.
		
		byte[] checkByte = new byte [10];
		
		checkByte[0] = 'K';
		checkByte[1] = 'I';
		checkByte[2] = 'N';
		checkByte[3] = 'G';
		checkByte[4] = '!';
		// �Էµ� "KING!" �� writer�� ����� �ܼ��� ����� ���ڴ�.
		
		System.out.println("------------------------------------------------");
		System.out.println("== ���ۿ� ����Ǿ� �ִ� �����Ͱ� ��µ˴ϴ�. == ");
		try {
			os.write(checkByte);
			// write�� �̿��� �Էµ� �����͸� ���
			os.flush();
			// ���ۿ� �ܷ��ϴ� ��� �����͸� ����ϴ� �޼ҵ�
			// write ���� �ݵ�� ����ؾ� �Ѵ�.
			// ���۸� ����� ������ ���� ��¹� �����
			// ������ �ʴ� �����Ϳ� �Բ� ��µ� �� �ֱ� �����̴�.
			os.close();
			// ����� �Ϸ�Ǿ��� ������ OutputStream�� �ݾ��ش�.
			// �̷ν� �ڿ��� Ǯ���ִ� ����� �ϰ� �ȴ�.
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
}