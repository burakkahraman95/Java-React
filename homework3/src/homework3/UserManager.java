package homework3;

public class UserManager {
	
	public void createAccount(User user) {
		System.out.println("Account created for " + user.getFirstName() + " " + user.getLastName());
	}
	
	public void deleteAccount(User user) {
		System.out.println("Account deleted for "+  user.getFirstName() + " " + user.getLastName());
	}
	
	public void updateAccount(User user) {
		System.out.println("Account updated for "+  user.getFirstName() + " " + user.getLastName());
	}
	

}
