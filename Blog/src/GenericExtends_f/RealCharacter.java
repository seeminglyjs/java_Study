package GenericExtends_f;

public class RealCharacter<T> implements Character<T> {

	@Override
	public void Attack(T attack) {
		System.out.println(attack + " 만큼의 피해를 입혔다!!!!");
	}
	@Override
	public void Defense(T defense) {
		System.out.println(defense + " 만큼의 피해를 방어했다!!!!");
	}
	
	
	
	
	
}
