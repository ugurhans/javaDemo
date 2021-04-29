package Bussiness;
import Entity.Course;

public class InstructorManager extends UserManager{


	public void openCourse(Course course) {
		System.out.println(course.getName() + " has been opened.");
	}
	
	public void closeCourse(Course course) {
		System.out.println(course.getName() + " has been closed.");
	}
}
