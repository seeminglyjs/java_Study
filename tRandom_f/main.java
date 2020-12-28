package tRandom_f;

import java.util.Random;

public class main {

	public static void main(String[] args) {
		
		Random ran = new Random();
		//랜덤 클래스 선언
		
		int [] arrI = new int [6];
		
		for(int i = 0; i < 6; i++) {
			arrI[i] = ran.nextInt(6) + 1;	
		}
		
		
		for(int i = 0; i < 5; i++) {
			System.out.println(arrI[i]);
		}
		
		
	}

}
//Random ran = new Random();
////랜덤 클래스 선언
//
//int [] arrI = new int [5];
//long [] arrL = new long[5];
//float[] arrF = new float[5];
//boolean [] arrB = new boolean [5];
////각 타입별 5개의 값이 들어갈 배열 선언
//
//for(int i = 0; i < 5; i++) {
//	arrI[i] = ran.nextInt();
//	arrL[i] = ran.nextLong();
//	arrF[i] = ran.nextFloat();
//	arrB[i] = ran.nextBoolean();
//}
//
//
//for(int i = 0; i < 5; i++) {
//	System.out.println(arrI[i] + " / " + arrL[i] + " / " 
//						+ arrF[i] + " / " + arrB[i] + " / ");
//}

