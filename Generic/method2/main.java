package Generic.method2;

public class main {

	public static void main(String[] args) {
		Pair<Integer, String> p1 = new Pair<>(1,"사과");
		Pair<Integer, String> p2 = new Pair<>(1,"사과");
		
		//Util.<Integer,String>compare(p1, p2);
		boolean result1 = Util.compare(p1, p2); // 유추해서 가능함
	
		if(result1) {
			System.out.println("논리적 동등객체");
		}else {
			System.out.println("다른 객체이다.");
		}
		
		
		Pair<String, String> p3 = new Pair<>("user1","사과");
		Pair<String, String> p4 = new Pair<>("홍길동","사과");
		
		//Util.<Integer,String>compare(p1, p2);
		boolean result2 = Util.compare(p3, p4); // 유추해서 가능함
	
		if(result2) {
			System.out.println("논리적 동등객체");
		}else {
			System.out.println("다른 객체이다.");
		}
		
	}
	

}
