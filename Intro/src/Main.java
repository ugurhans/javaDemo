import Bussiness.CourseManager;
import Bussiness.InstructorManager;
import Bussiness.StudentManager;
import Bussiness.UserManager;
import Entity.Course;
import Entity.Instructor;
import Entity.Student;

public class Main {

	public static void main(String[] args) {

		UserManager userManager = new UserManager();	
		Student student = new Student();
		student.setFirstName("Selaxx");
		student.setLastName("Hero");
		userManager.Add(student);
		
		Instructor instructor = new Instructor();
		instructor.setFirstName("Tırtıl");
		instructor.setLastName("Kelebek");
		userManager.Update(instructor);
		
		Course myCourse = new Course(1, "Udemy");
		
		Course[] courses = {myCourse};
		
		CourseManager courseManager = new CourseManager();
		courseManager.add(courses);

		InstructorManager instructorManager = new InstructorManager();
		instructorManager.openCourse(myCourse);
		
		StudentManager studentManager = new StudentManager();
		studentManager.joinCourse(student, myCourse);
		 
			 
		 
	}

}
