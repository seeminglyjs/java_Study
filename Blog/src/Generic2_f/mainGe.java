package Generic2_f;

import java.util.Arrays;

public class mainGe {
	
	public static void defineSpecice(specice<?> specice) {
		System.out.println(specice.getName() + " " +
			Arrays.toString(specice.getSpecices()));
	}
	
	public static void defineSpeciceSimian(specice<? extends simian> specice) {
		System.out.println(specice.getName() + " " +
			Arrays.toString(specice.getSpecices()));
	}
	
	public static void defineSpeciceLion(specice<? super lion> specice) {
		System.out.println(specice.getName() + " " +
			Arrays.toString(specice.getSpecices()));
	}
	
	public static void main(String[] args) {
		
		specice<animal> sAnimal = new specice<animal>("종족: ", 4);
		sAnimal.add(new animal("동물"));
		sAnimal.add(new simian("유인원"));
		sAnimal.add(new human("사람"));
		sAnimal.add(new lion("사자"));
		
		specice<simian> sSimian = new specice<simian>("종족: ", 2);
		sSimian.add(new simian("유인원"));
		sSimian.add(new human("사람"));
		
		specice<human> sHuman = new specice<human>("종족: ", 1);	
		sHuman.add(new human("사람"));
		
		specice<lion> sLion = new specice<lion>("종족: ", 2);	
		sLion.add(new lion("사자"));
		
		
		defineSpecice(sAnimal);
		defineSpecice(sSimian);
		defineSpecice(sHuman);
		defineSpecice(sLion);
		System.out.println();
		
//		defineSpeciceSimian(sAnimal); // 상위 클래스는 컴파일 오류
		defineSpeciceSimian(sSimian); // 자신 정상출력
		defineSpeciceSimian(sHuman); //상속받은 클래스는 정상 출력
//		defineSpeciceSimian(sLion); // 상속받지 않은 클래스는 컴파일 오류
		System.out.println();
		
		defineSpeciceLion(sAnimal); // 상속받은 상위 클래스 정상 출력
//		defineSpeciceLion(sSimian); // 관련없는 클래스 컴파일 오류
//		defineSpeciceLion(sHuman); // 관련없는 클래스 컴파일 오류
		defineSpeciceLion(sLion); // 자신 정상출력
		System.out.println();
		
	}

}
