package ECommerance.core;

import ECommerance.entities.concretes.User;

public class GoogleAuthManagerAdapter implements authService {
	googleAuthManager authManager;

	@Override
	public void register(User user) {
		authManager.register(user);
		
	}

	@Override
	public void login(User user) {
		authManager.login(user);
		
	}
	
	
}
