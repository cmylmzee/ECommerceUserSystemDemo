package ECommerance.core;

import ECommerance.entities.concretes.User;

public class googleAuthManager {
	public void register(User user) {
        System.out.println(user.getFirstName()+" : Google ile kayýt olundu.");
    }

    public void login(User user) {
        System.out.println(user.getFirstName()+" : Google ile giriþ yapýldý.");
    }
}
