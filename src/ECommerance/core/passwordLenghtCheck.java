package ECommerance.core;

public class passwordLenghtCheck {
	public static boolean check(String password) {
		if(password.length()>=6) {
			return true;
		}
		return false;
		
	}
}
