package homework3;

public class studentManager {
	public void addCourse(Course course,Student student) {
		System.out.println("Student: "  + student.firstName + " "+student.lastName + " joined this: " + course.getName() + " course" );
	}
	
	public void addHomework(Course course, Student student) {
		System.out.println("Student: " + student.firstName + " "+student.lastName + " joined this: " + course.getName() + " course" );
	}
}
