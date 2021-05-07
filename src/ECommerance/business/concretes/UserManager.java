package ECommerance.business.concretes;

import ECommerance.business.abstracts.UserService;
import ECommerance.core.ValidatorService;
import ECommerance.core.emailValidator;
import ECommerance.core.namesCheck;
import ECommerance.core.passwordLenghtCheck;
import ECommerance.dataAccess.abstracts.UserDao;
import ECommerance.entities.concretes.User;

public class UserManager implements UserService {
	
	UserDao userDao;
	ValidatorService validatorService;
	
	public UserManager(UserDao userDao,ValidatorService validatorService) {
		super();
		this.userDao = userDao;
		this.validatorService = validatorService;
	}

	@Override
	public void register(User user) {
		if(emailValidator.trueMail(user.getEmail()) && passwordLenghtCheck.check(user.getPassword()) && namesCheck.checkName(user.getFirstName(),user.getLastName())) {
			validatorService.sendVerification();
			System.out.println("Baþarýyla kayýt olundu.");
			userDao.add(user);
		}else {
			System.out.printf("Kayýt baþarýsýz.%nKayýt bilgileriniz en az :%n1-Parola en az 6 karakterden oluþmalýdýr%n2-Ad ve soyad en az iki karakterden oluþmalýdýr.%n");
		}
		
	}

	@Override
	public void login(User user) {
		System.out.println("Baþarýyla giriþ yapýldý.");
	}

	@Override
	public void registerWithGoogle(User user) {
		System.out.println("Google ile kayýt yapýldý.");
		
	}

	@Override
	public void loginWithGoogle(User user) {
		System.out.println("Google ile giriþ yapýldý.");		
	}

	@Override
	public void logout(User user) {
		System.out.println("Google ile çýkýþ yapýldý.");
		
	}

}
