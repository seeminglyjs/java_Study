package GenericExtends_f;

public class RealCharacter<T> implements Character<T> {

	@Override
	public void Attack(T attack) {
		System.out.println(attack + " ��ŭ�� ���ظ� ������!!!!");
	}
	@Override
	public void Defense(T defense) {
		System.out.println(defense + " ��ŭ�� ���ظ� ����ߴ�!!!!");
	}
	
	
	
	
	
}
