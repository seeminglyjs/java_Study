package HashTable;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Map<String, String>map = new Hashtable<String, String>();
		
		map.put("spring", "12");
		map.put("summer", "123");
		map.put("fall", "1234");
		map.put("winter", "12345");
		
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("id / password");
			String id = scan.nextLine();
			
			String pw = scan.nextLine();
			System.out.println();
		
			if(map.containsKey(id)) {
				if(map.get(id).equals(pw)) {
					System.out.println("Login");
					break;
				}else {
					System.out.println("pw error");
				}
			}else {
				System.out.println("id error");
			}
		}
	}

}
