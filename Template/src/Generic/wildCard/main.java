package Generic.wildCard;

import java.util.Arrays;

public class main {
	
	public static void registerCourse(Course<?> course) {	
		System.out.println(course.getName() + "������:" + Arrays.toString(course.getStudents()));
	}
	
	public static void registerCourseStudent(Course<? extends Student> course) {	
		System.out.println(course.getName() + "������:" + Arrays.toString(course.getStudents()));
	}
	
	public static void registerCourseWorker(Course<? super Worker> course) {	
		System.out.println(course.getName() + "������:" + Arrays.toString(course.getStudents()));
	}
	
	public static void main(String[] args) {
		
//		registerCourse(new Course<Person>("�Ϲ��� ����", 5));
//		registerCourse(new Course<Student>("�л� ����", 5));
//		registerCourse(new Course<Worker>("�ٷ��� ����", 5));
//		registerCourse(new Course<HighStudent>("����л� ����", 5));
//		
//		//registerCourseStudent(new Course<Person>("�Ϲ��� ����", 5));
//		registerCourseStudent(new Course<Student>("�л� ����", 5));
//		//registerCourseStudent(new Course<Worker>("�ٷ��� ����", 5));
//		registerCourseStudent(new Course<HighStudent>("����л� ����", 5));
//		
//		
//		registerCourseWorker(new Course<Person>("�Ϲ��� ����", 5));
//		registerCourseWorker(new Course<Student>("�л� ����", 5));
//		registerCourseWorker(new Course<Worker>("�ٷ��� ����", 5));
//		registerCourseWorker(new Course<HighStudent>("����л� ����", 5));
	
		Course<Person> personCourse = new Course<Person>("�Ϲ��� ����", 5);
		personCourse.add(new Person("�Ϲ���"));
		personCourse.add(new Person("������"));
		personCourse.add(new Person("�л�"));
		personCourse.add(new Person("����л�"));
		
		Course<Worker> workerCourse = new Course<>("������ ����", 5);
		workerCourse.add(new Worker("������"));
	
		Course<Student> studentCourse = new Course<>("�л� ����", 5);
		studentCourse.add(new Student("�л�"));
		studentCourse.add(new HighStudent("�л�"));
		
		Course<HighStudent> highStudentCourse = new Course<>("����л� ����", 5);
		highStudentCourse.add(new HighStudent("�л�"));
	
	
		registerCourse(personCourse);
		registerCourse(workerCourse);
		registerCourse(studentCourse);
		registerCourse(highStudentCourse);
		System.out.println();
		
//		registerCourseStudent(personCourse);
//		registerCourseStudent(workerCourse);
		registerCourseStudent(studentCourse);
		registerCourseStudent(highStudentCourse);
		System.out.println();
		
		registerCourseWorker(personCourse);
		registerCourseWorker(workerCourse);
//		registerCourseWorker(studentCourse);
//		registerCourseWorker(highStudentCourse);
		System.out.println();
	}

}
