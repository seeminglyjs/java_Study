package aa_sString_Split_f;

import java.util.ArrayList;
import java.util.List;

public class main {

	public static void main(String[] args) {
		
		// split �޼��带 �̿��ϸ� ���ڿ��� Ư�� ��ȣ�� ����
		// ���ڿ��� ������ �и��Ͽ� ������ �� �ִ�..
		
		String str = "hi-hi,hi%hi,hi-hi,hi%hi";
		// ���ʿ��� Ư�� Ư�� ��ȣ�� �� �ִ� ���ڿ� ���� ����.
		
		//�ϳ��� ������ �ɰ��� String�� ���ڵ����͸� ���� ���� �� ���� ������
		//String �迭�� �ϳ� ������ش�.
		
		String [] arr = str.split("-|%|,"); 
		//�� ���ڿ��� �����Ͽ� �迭�� ����ش�.
		
		for(String s : arr) {
			System.out.print(s + " ");
		}
		//forEach���� ���� ��ü�迭�� ��ȸ�ϸ鼭 ����� ���ش�.
		
	}

}
