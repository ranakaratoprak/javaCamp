package example5.business.concretes;

import example5.business.abstracts.AuthService;
import example5.business.abstracts.UserService;
import example5.entities.concretes.User;
import example5.core.abstracts.CoreAuthService;

public class AuthManager implements AuthService {

	private UserService userService;
	private CoreAuthService coreAuthService;

	public AuthManager(UserService userService, CoreAuthService coreAuthService) {
		super();
		this.userService = userService;
		this.coreAuthService = coreAuthService;
	}

	@Override
	public void login(String email, String password) {
		userService.loginUser(email, password);

	}

	@Override
	public void register(User user) {

		userService.register(user);

	}

	@Override
	public void registerGoogleAccount(String message) {
		coreAuthService.saveGoogleAccount(message);

	}

}
