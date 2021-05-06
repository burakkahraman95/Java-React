package homework2;

public class CourseManager {
	public void add(Course course) {
		System.out.println(course.courseName + " course added");
	}
	public void addMultiple(Course[] courses) {
		for(Course course:courses) {
			add(course);
		}
	}
}
