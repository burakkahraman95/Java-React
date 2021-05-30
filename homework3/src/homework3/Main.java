package homework3;

public class Main {
	 public static void main(String[] args) {
	
	Instructor instructor = new Instructor();
	instructor.setId(1);
    instructor.setFirstName("Engin");
    instructor.setLastName("Demirog");
    instructor.setEmail("engindemirog@example.com");
    instructor.setPassword("admin123");
    instructor.setTitle("Software Expert");
    
    Student student = new Student();
    student.setId(100);
    student.setFirstName("Burak");
    student.setLastName("Kahraman");
    student.setEmail("burak@example.com");
    student.setPassword("admin123");
    student.setDepartment("Industrial Engineering");
    
    Student student2 = new Student();
    student2.setId(101);
    student2.setFirstName("Derya");
    student2.setLastName("Kahraman");
    student2.setEmail("derya@example.com");
    student2.setPassword("admin123");
    student2.setDepartment("Software Engineering");
    
    Course course1 = new Course();
    course1.name = "Angular ile Web Gelistirme";
    course1.cost = "Free";
    
    Course course2 = new Course();
    course2.name="React ile Web Gelistirme";
    course2.cost= "Free";
    
    InstructorManager instructorManager = new InstructorManager();
    instructorManager.addCourse(course1, instructor);
    instructorManager.addHomework(course2, instructor);
    
    studentManager studentManager = new studentManager();
    studentManager.addCourse(course1, student);
    studentManager.addHomework(course2, student2);
    
    UserManager userManager = new UserManager();
    userManager.createAccount(student);
    userManager.deleteAccount(student2);
    userManager.updateAccount(instructor);
    
    
    
    
   
	 }
}
