package ECommerance.core;

public class namesCheck {
	public static boolean checkName(String name, String surName) {
		if(name.length()>= 2 && surName.length() >=2 ) {
			return true;
		}
		return false;
		
		
		
		
	}
}
