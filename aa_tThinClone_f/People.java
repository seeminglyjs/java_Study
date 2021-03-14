package aa_tThinClone_f;

import java.util.Arrays;

public class People implements Cloneable {
	String name;
	int age;
	
	public People(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public People copyPeople() {
		People cloneP = null;
		try {
			cloneP = (People) clone();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return cloneP;
	}
	
	
}
