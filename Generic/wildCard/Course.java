package Generic.wildCard;

public class Course<T> {
	private String name;
	private T[] students;
	
	public Course(String name, int capacity) {
		this.name = name;
		students = (T[])new Object[capacity];
		//T가 결정이 나지 않은 상태에서는 티타입 배열을 만들 수 없다.
		//때문에 object배열을 먼저 만들고 강제 형변환 해주어야 한다.
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
  
