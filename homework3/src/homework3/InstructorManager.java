package homework3;

public class InstructorManager {
	public void addCourse(Course course, Instructor instructor) {
		System.out.println( instructor.firstName + " " + instructor.lastName  + " added this course: " + course.name  );
	}
	
	public void addHomework(Course course, Instructor instructor) {
		System.out.println(instructor.firstName + " " + instructor.lastName + " added homework for this course: " + course.name );
	}

}
