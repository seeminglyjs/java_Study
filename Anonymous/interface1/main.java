package Anonymous.interface1;

public class main {

	public static void main(String[] args) {
		
		An an = new An();
		
		an.field.turnOn();
		an.field.turnOff();
	
		an.method1();
		
		an.method2(new Rem(){
			@Override
			public void turnOn() {
				System.out.println("smart on");
				
			}
			@Override
			public void turnOff() {
				System.out.println("smart off");
				
			}
		});
	
	}

}
