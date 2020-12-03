package Stream.parallel;

import java.util.ArrayList;
import java.util.List;

public class MaleStudent {
	private List<Student> list;
	
	public MaleStudent() {
		list = new ArrayList<Student>();
		System.out.println("MaleStudent :"+Thread.currentThread().getName());
	}
	
	public void accumulate(Student student) {
		list.add(student);
		System.out.println("accumulate :"+Thread.currentThread().getName());
	}
	
	public void combine(MaleStudent other) {
		list.addAll(other.getList());
		System.out.println("combine :"+Thread.currentThread().getName());
	}
	
	public List<Student>getList(){
		return list;
	}
}
