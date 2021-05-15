package example5.business.concretes;

import example5.business.abstracts.UserCheckManager;
import example5.business.abstracts.UserService;
import example5.dataAccess.abstracts.UserDao;
import example5.entities.concretes.User;

public class UserManager extends UserCheckManager implements UserService {

	private UserDao userDao;

	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public void register(User user) {
		if ((emailRule(user)) && (nameRule(user)) && (passwordRule(user)) && (userExist(user.getEmail()))) {
			sendVerificationMail(user);
			userDao.add(user);
		}
	}

	@Override
	public void loginUser(String email, String password) {
		if(userDao.loginUser(email, password)) {
			System.out.println("Giriþ yapýldý.");
		}else {
			System.out.println("E-postanýz veya þifreniz hatalýdýr.");
		}
	
	}

	private boolean userExist(String email) {
		for (User user : userDao.getAll()) {
			if (user.getEmail() == userDao.getMail(email)) {
				System.out.println("Bu email ile kayýtlý bir kullanýcý bulunmaktadýr.");
				return false;
			}
		}
		return true;
	}

	
}