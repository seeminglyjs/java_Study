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
			//우선 문자열로 받고 하나씩 잘라가며 배열에 넣어줌
			
			for(int k = 0; k < 16; k++) {
				if(CardNum[k] % 2 == 0) {
					CardNum[k] *= 2;
					//짝수 체크후 짝수면 두배를 곱해줌
					if(CardNum[k] >= 10) {
					int temp = CardNum[k] % 10;
					CardNum[k] /= 10;
					CardNum[k] += temp;
					//10이상일 경우 10으로 나눈 나머지를 temp변수에  임시보관 후
					//현재 배열을 10으로 나눈 몫과 더해서 새로운 값을 넣어줌
				}
			}
				sum += CardNum[k];
				//해당값 총합에 넣어줌
			}
			System.out.println();
			if(sum % 10 == 0) {
				System.out.println("T");
			}else {
				System.out.println("F");
			}
			//10으로 나누어 나머지가 있나 체크
			
		}
    }
}
