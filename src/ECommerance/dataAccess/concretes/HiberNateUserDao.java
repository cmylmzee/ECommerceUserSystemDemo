package ECommerance.dataAccess.concretes;

import ECommerance.dataAccess.abstracts.UserDao;
import ECommerance.entities.concretes.User;

public class HiberNateUserDao implements UserDao {

	@Override
	public void add(User user) {
		System.out.println("HiberNate ile eklendi.");
		
	}

	@Override
	public void delete(User user) {
		System.out.println("HiberNate ile silindi.");
	}

	@Override
	public void update(User user) {
		System.out.println("HiberNate ile güncellendi.");
		
	}

}
