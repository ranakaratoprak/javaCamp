package example5.core.concretes;

import example5.core.abstracts.CoreAuthService;
import example5.googleAuth.GoogleAuthManager;

public class GoogleAuthManagerAdapter implements CoreAuthService {

	@Override
	public void saveGoogleAccount(String message) {
		GoogleAuthManager googleAuthManager = new GoogleAuthManager();
		googleAuthManager.login(message);
		
	}

}
