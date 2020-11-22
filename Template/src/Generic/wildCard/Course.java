package Generic.wildCard;

public class Course<T> {
	private String name;
	private T[] students;
	
	public Course(String name, int capacity) {
		this.name = name;
		students = (T[])new Object[capacity];
		//T�� ������ ���� ���� ���¿����� ƼŸ�� �迭�� ���� �� ����.
		//������ object�迭�� ���� ����� ���� ����ȯ ���־�� �Ѵ�.
	}
	
	public String getName() {return name;}
	public T[] getStudents() {return students;}
	
	public void add(T t) {
		for(int i = 0; i < students.length; i++) {
			if(students[i] == null) {
				students[i] = t;
				break;
			}
		}
	}
} 
  
