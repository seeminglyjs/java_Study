package aa_tEnum_f;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String name = scan.next();
		// ������ �̸��� �Է¹޴´�.
		// enum�� KING��� �̸��� ������ �񱳸� �غ���.
		
		Name realName = Name.KING;
		// enum ������ KING�� ����ش�.
		
		if(name.equals(realName.name())) {
			// Ÿ���� enum�̱� ������
			// name �޼ҵ�� String���·� ���ϵǰ� ���ش�.
			System.out.println("����� KING �̱���!!");
		}else {
			System.out.println("����� KING�� �ƴϾ�!!!!!");
		}
		
	}

}
