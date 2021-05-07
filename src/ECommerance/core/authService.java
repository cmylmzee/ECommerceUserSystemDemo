package ECommerance.core;
import ECommerance.entities.concretes.User;

public interface authService {
	void register(User user);
	void login(User user);
}
