import java.util.Scanner;

public class TemplateA {
    public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		int Tcase = scan.nextInt();
		int [] CardNum = new int [16];
		
		int sum = 0;
		
		for(int i = 0; i < Tcase; i++) {
			String str = scan.next();
			for(int j = 0; j < 16; j++) {
				CardNum[j] = str.charAt(j) - '0';
			}
			//�켱 ���ڿ��� �ް� �ϳ��� �߶󰡸� �迭�� �־���
			
			for(int k = 0; k < 16; k++) {
				if(CardNum[k] % 2 == 0) {
					CardNum[k] *= 2;
					//¦�� üũ�� ¦���� �ι踦 ������
					if(CardNum[k] >= 10) {
					int temp = CardNum[k] % 10;
					CardNum[k] /= 10;
					CardNum[k] += temp;
					//10�̻��� ��� 10���� ���� �������� temp������  �ӽú��� ��
					//���� �迭�� 10���� ���� ��� ���ؼ� ���ο� ���� �־���
				}
			}
				sum += CardNum[k];
				//�ش簪 ���տ� �־���
			}
			System.out.println();
			if(sum % 10 == 0) {
				System.out.println("T");
			}else {
				System.out.println("F");
			}
			//10���� ������ �������� �ֳ� üũ
			
		}
    }
}
