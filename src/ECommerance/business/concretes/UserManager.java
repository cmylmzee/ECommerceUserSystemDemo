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
			System.out.println("Ba�ar�yla kay�t olundu.");
			userDao.add(user);
		}else {
			System.out.printf("Kay�t ba�ar�s�z.%nKay�t bilgileriniz en az :%n1-Parola en az 6 karakterden olu�mal�d�r%n2-Ad ve soyad en az iki karakterden olu�mal�d�r.%n");
		}
		
	}

	@Override
	public void login(User user) {
		System.out.println("Ba�ar�yla giri� yap�ld�.");
	}

	@Override
	public void registerWithGoogle(User user) {
		System.out.println("Google ile kay�t yap�ld�.");
		
	}

	@Override
	public void loginWithGoogle(User user) {
		System.out.println("Google ile giri� yap�ld�.");		
	}

	@Override
	public void logout(User user) {
		System.out.println("Google ile ��k�� yap�ld�.");
		
	}

}
