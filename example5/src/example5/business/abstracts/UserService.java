package example5.business.abstracts;

import example5.entities.concretes.User;

public interface UserService {
	void register(User user);
	void loginUser(String email, String password);
}
