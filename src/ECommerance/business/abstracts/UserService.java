package ECommerance.business.abstracts;

import ECommerance.entities.concretes.User;

public interface UserService {
	void register(User user);
	
	void login(User user);
	
	void registerWithGoogle(User user);
	
	void loginWithGoogle(User user);
	
	void logout(User user);
}
