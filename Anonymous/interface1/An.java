package Anonymous.interface1;

public class An {
	Rem field = new Rem() {
		@Override
		public void turnOn() {
			System.out.println("Tv on");
		}		
		@Override
		public void turnOff() {
			System.out.println("Tv off");			
		}
	};
	
	
	void method1() {
		Rem localVal = new Rem() {
		@Override
		public void turnOn() {
			System.out.println("Tv on");
		}		
		@Override
		public void turnOff() {
			System.out.println("Tv off");			
		}
	};
		localVal.turnOn();
		localVal.turnOff();
	}
	
	void method2(Rem rc) {
		rc.turnOn();
		rc.turnOff();
	}
}
