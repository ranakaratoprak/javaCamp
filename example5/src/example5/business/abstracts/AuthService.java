package example5.business.abstracts;


import example5.entities.concretes.User;


public interface AuthService {
	void register(User user);
	void registerGoogleAccount(String message);
	void login(String email, String password);
}
