package Generic.wildCard;

import java.util.Arrays;

public class main {
	
	public static void registerCourse(Course<?> course) {	
		System.out.println(course.getName() + "수강생:" + Arrays.toString(course.getStudents()));
	}
	
	public static void registerCourseStudent(Course<? extends Student> course) {	
		System.out.println(course.getName() + "수강생:" + Arrays.toString(course.getStudents()));
	}
	
	public static void registerCourseWorker(Course<? super Worker> course) {	
		System.out.println(course.getName() + "수강생:" + Arrays.toString(course.getStudents()));
	}
	
	public static void main(String[] args) {
		
//		registerCourse(new Course<Person>("일반인 과정", 5));
//		registerCourse(new Course<Student>("학생 과정", 5));
//		registerCourse(new Course<Worker>("근로자 과정", 5));
//		registerCourse(new Course<HighStudent>("고등학생 과정", 5));
//		
//		//registerCourseStudent(new Course<Person>("일반인 과정", 5));
//		registerCourseStudent(new Course<Student>("학생 과정", 5));
//		//registerCourseStudent(new Course<Worker>("근로자 과정", 5));
//		registerCourseStudent(new Course<HighStudent>("고등학생 과정", 5));
//		
//		
//		registerCourseWorker(new Course<Person>("일반인 과정", 5));
//		registerCourseWorker(new Course<Student>("학생 과정", 5));
//		registerCourseWorker(new Course<Worker>("근로자 과정", 5));
//		registerCourseWorker(new Course<HighStudent>("고등학생 과정", 5));
	
		Course<Person> personCourse = new Course<Person>("일반인 과정", 5);
		personCourse.add(new Person("일반인"));
		personCourse.add(new Person("직장인"));
		personCourse.add(new Person("학생"));
		personCourse.add(new Person("고등학생"));
		
		Course<Worker> workerCourse = new Course<>("직장인 과정", 5);
		workerCourse.add(new Worker("직장인"));
	
		Course<Student> studentCourse = new Course<>("학생 과정", 5);
		studentCourse.add(new Student("학생"));
		studentCourse.add(new HighStudent("학생"));
		
		Course<HighStudent> highStudentCourse = new Course<>("고등학생 과정", 5);
		highStudentCourse.add(new HighStudent("학생"));
	
	
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
