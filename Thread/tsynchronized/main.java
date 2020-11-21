package Thread.tsynchronized;

public class main {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		user1 user1 = new user1();
		user1.setCalculator(calculator);
		user1.start();
		
		
		user2 user2 = new user2();
		user2.setCalculator(calculator);
		user2.start();
	} 

}
