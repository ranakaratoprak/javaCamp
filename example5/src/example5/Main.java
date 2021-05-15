package example5;


import example5.business.concretes.AuthManager;
import example5.business.concretes.UserManager;
import example5.core.concretes.GoogleAuthManagerAdapter;
import example5.dataAccess.concretes.HibernateUserDao;
import example5.entities.concretes.User;



public class Main {

	public static void main(String[] args) {
				
		User user3 = new User(3,"rana", "ka", "rana3@rana.com", "111111");
		
		AuthManager authManager = new AuthManager(new UserManager(new HibernateUserDao()), new GoogleAuthManagerAdapter()); 
		
		authManager.register(user3);
		//authManager.registerGoogleAccount(user3.getFirstName());
		authManager.login(user3.getEmail(), user3.getPassword());
		
	
	}

}
