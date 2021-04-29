package Bussiness;
import Entity.User;

public class UserManager {

	
	public void Add(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " " + "has been added.");
	}

	public void Update(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " " + "has been updated.");
	}

	public void Delete(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " " + "has been deleted.");
	}

}
