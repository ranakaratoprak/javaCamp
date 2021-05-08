package example2;

public class UserManager {
	public void addUser(User user) {
		System.out.println(user.getUserId() + " kaydedildi.");
	}
	public void addMultipleUser (User[] users){
	     for (User user:users){
	         addUser(user);
	     }
	}
	public void deleteUser(User user) {
		System.out.println(user.getUserId() + " silindi.");
	}

	public void updateUser(User user) {
		System.out.println(user.getUserId() + " güncellendi.");
	}
}
