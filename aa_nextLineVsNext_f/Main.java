package aa_nextLineVsNext_f;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		// Scanner �� ����ϴ� ���� String ������ �ֿܼ� �Է¹޴�
		// ��찡 ����� ����. ���� Scanner ���� �����ϴ�
		// nextLine / next �� �ΰ��� �޼��带 ����ؼ� �Է��� ���� ���̴�.
		// ������ �� �� �޼����� ���̸� �˾ƺ���.
		
//		String str1 = scan.next();
//		// �켱 next�� ��� ���鹮�ڸ� �޾Ƶ��� ���� ����.
//		// ���� ���� �Է� "a a"�� ���� ����� �־��ٰ� ����.
//		System.out.println("str1 -> " + str1);
		
		// ��İ���� Ȯ���غ���
		// " a" ����� a�� ����, ó���� a�� ����Ǿ� 
		// ��µǴ� ���� Ȯ���� �� �ִ�.
		// �� Scanner�� next�� ��ū�� ��������
		// ���ڿ��� �Է¹޴µ�, �ش� ��ū���� ���鹮�ڴ�
		// �����ڷ� �ν��� �տ��ִ� a�� ����Ǵ� ���̴�.
		// �� ���� ���ϸ�
		// Enter Ű�� ���� Space Ű�� �����ڷ� �ν��Ѵٴ� ���̴�.
		
		
//		
//		String str2 = scan.nextLine();
//		// �׷��� �ٷ� nextLine �޼ҵ尡 �ʿ��ϴٴ� ���̴�.
//		// �޼ҵ� �̸������� ���������� ���鹮�ڿ� �������
//		// �ܼ�â ����(Line)�� ������ ��� �ν��� String ������
//		// �����Ѵٴ� ���̴�.
//		// ���������� "a a"�� �Է°����� �־��־� ���ڴ�.
//		System.out.println("str2 -> " + str2);
//		// ��°�� ���鹮�ڰ� ���Ե� ���ڿ��� �Է°����� 
//		// �־������� �ұ��ϰ� ��� �����Ͽ� ��µǴ� ���� Ȯ���� �� �ִ�.
		
		
		// �׷��� ���⼭ �ñ����� ���� ���� �ִ�. �׷���
		// next ���� nextLine ������ �Ǵ°� �ƴϾ�?? ��� ���̴�.
		// �� �޼ҵ尡 �ΰ��� �׿� ���� ������ �ִ�.
		// �Ʒ� ������ ����.
		// �̹����� �����ؼ� next�� nextLine �޼ҵ带 ����غ���
		// �Ű������� ���������� "a a" �� �� ���̴�.
		
		
//		String str1 = scan.next();
//		System.out.println("str1 -> " + str1);
//		String str2 = scan.nextLine();
//		System.out.println("str2 -> " + str2);
//		
//		// ��°��
//		//a a
//		//a
//		// a
		
		
		
		// �׷� ���� ���� ����� ����� ������ �ȴ�. 
		// �̴� next()�� �ް� ���� " a" �� 
		// scan.nextLine���� �Ѿ�� �����̴�.
		// ���� ���ϸ� " a" ��� ������ ���ڿ��� ����
		// ���ۿ� ������ �ִ� �����ε� �̿Ͱ��� ���۸�
		// ó������ �ʰ� �ٽ� �Է��� ������� �ϴ�,
		// ������������ �켱������ ���� ������ ���ڿ���
		// ���������� ���̴�.
		// ������ nextLine() ���� nextXXX �� ���� �޼ҵ带
		// ����ߴٸ� �ݵ�� ���۸� ����־���Ѵ�.
		
//		String str1 = scan.next();
//		System.out.println("str1 -> " + str1);
//		scan.nextLine();
//		String str2 = scan.nextLine();
//		System.out.println("str2 -> " + str2);
		
		// ���� ���� nextLine���� ������ �������
		// nextLine �޼ҵ常 ȣ���� ���۸� ����ָ�
		// �������� ���� �Է��� ���� �� �ִ�.
		// ���� ���ʺ��� String���� ��� nextLine���� ������
		// �� ������ WrapperŬ������ ��� �ٽ� ���ϴ� ���·�
		// ����ȯ�� ���ָ� �̿Ͱ��� ���۹����� �������� �ʾƵ� �ȴ�.
		// �Ʒ��� �� ���̴�.
		
		String temp = scan.nextLine();
		int num1 = Integer.parseInt(temp);
		System.out.println("num1 -> " + num1);
		String str2 = scan.nextLine();
		System.out.println("str2 -> " + str2);
		
		
	}
}
