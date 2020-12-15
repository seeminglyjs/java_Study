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
		
		specice<animal> sAnimal = new specice<animal>("����: ", 4);
		sAnimal.add(new animal("����"));
		sAnimal.add(new simian("���ο�"));
		sAnimal.add(new human("���"));
		sAnimal.add(new lion("����"));
		
		specice<simian> sSimian = new specice<simian>("����: ", 2);
		sSimian.add(new simian("���ο�"));
		sSimian.add(new human("���"));
		
		specice<human> sHuman = new specice<human>("����: ", 1);	
		sHuman.add(new human("���"));
		
		specice<lion> sLion = new specice<lion>("����: ", 2);	
		sLion.add(new lion("����"));
		
		
		defineSpecice(sAnimal);
		defineSpecice(sSimian);
		defineSpecice(sHuman);
		defineSpecice(sLion);
		System.out.println();
		
//		defineSpeciceSimian(sAnimal); // ���� Ŭ������ ������ ����
		defineSpeciceSimian(sSimian); // �ڽ� �������
		defineSpeciceSimian(sHuman); //��ӹ��� Ŭ������ ���� ���
//		defineSpeciceSimian(sLion); // ��ӹ��� ���� Ŭ������ ������ ����
		System.out.println();
		
		defineSpeciceLion(sAnimal); // ��ӹ��� ���� Ŭ���� ���� ���
//		defineSpeciceLion(sSimian); // ���þ��� Ŭ���� ������ ����
//		defineSpeciceLion(sHuman); // ���þ��� Ŭ���� ������ ����
		defineSpeciceLion(sLion); // �ڽ� �������
		System.out.println();
		
	}

}
