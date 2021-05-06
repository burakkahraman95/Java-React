package homework2;

public class Main {

	public static void main(String[] args) {

		Category category1 = new Category();
		category1.setId(1);
		category1.setName("All");
		
		Category category2 = new Category();
		category2.setId(2);
		category2.setName("Programing");
		
		System.out.println("Category: > " + category1.getName());
		System.out.println("Category: > " + category2.getName());
		
		Instructor instructor1 = new Instructor(1, "Engin", "Demirog");
		System.out.println("Instructor: " + instructor1.firstName+ " " + instructor1.lastName);

		Course course1 = new Course(1,"'Yazilim Gelistirici Yetistirme Kampı(C# - Angular)'","Engin Demirog","Free");
		Course course2 = new Course(2,"'Yazilim Gelistirici Yetistirme Kampı (JAVA & REACT)'","Engin Demirog","Free");
		Course course3 = new Course(3,"'Programlamaya Giris Icin Temel Kurs'","Engin Demirog","Free");
		
		CourseManager courseManager =  new CourseManager();
		Course[] courses = {course1,course2,course3};
		
		courseManager.addMultiple(courses);
	}

}
