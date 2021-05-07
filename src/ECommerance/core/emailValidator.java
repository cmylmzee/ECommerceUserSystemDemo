package ECommerance.core;

import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class emailValidator {
	static String regex = "^(.+)@(.+)$";
	 
	static Pattern pattern = Pattern.compile(regex);
	 

	public static   boolean trueMail(String email) {
			Matcher matcher = pattern.matcher(email);
			if(pattern.matcher(email) != null) {
				return true;
			}else {
				return false;
			}
	}
	    
}
