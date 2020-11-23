package Lambda.andThenCompose;

import java.util.function.Consumer;

public class Consumer_ {
	
	public static void main(String[] args) {
		Consumer<Member> consumerA = (m)  ->{
			System.out.println(m.getName());
		};
		
		Consumer<Member> consumerB = (m)  ->{
			System.out.println(m.getId());
		};
	
		Consumer<Member> consumerAB = consumerA.andThen(consumerB);
		consumerAB.accept(new Member("È«±æµ¢", "¤É¤É¤É", null));
		
	}
	
	

}
