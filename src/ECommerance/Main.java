package ECommerance;

import ECommerance.business.concretes.UserManager;
import ECommerance.core.EmailValidatorManager;
import ECommerance.core.ValidatorService;
import ECommerance.dataAccess.abstracts.UserDao;
import ECommerance.dataAccess.concretes.HiberNateUserDao;
import ECommerance.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		User user = new User();
		user.setEmail("yilmazcem1122@gmail.com");
		user.setFirstName("Cem");
		user.setLastName("Yýlmaz");
		user.setPassword("1234kloum");
		UserDao dao = new HiberNateUserDao();
		ValidatorService service = new EmailValidatorManager();
		
		
		UserManager manager = new UserManager(dao,service);
		manager.register(user);
		System.out.println("-----------------------------");
		manager.login(user);
		System.out.println("-----------------------------");
		manager.loginWithGoogle(user);
		System.out.println("-----------------------------");
		manager.logout(user);
	}

}
