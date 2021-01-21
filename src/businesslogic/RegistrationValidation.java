package businesslogic;


public class RegistrationValidation {
	public boolean checkUserDetails(String email, String password, String confirmPassword) {
		return validEmail(email) && validPassword(password, confirmPassword);
	}
	private boolean validPassword(String password, String confirmPassword) {
		int length = password.length();
		String regex = "^(?=.*[a-z])(?=." + "*[A-Z])(?=.*\\d).+$";
		if ((password != confirmPassword) || password.isEmpty() || (length < 8) || (length > 20)) {
			return false;
		}
		boolean match = password.matches(regex);
		if (!match) {
			return false;
		}
		return true;
	}

	

	private boolean validEmail(String email) {
		
		 String s = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
		 System.out.println("Enter email validation");
		 return email.matches(s);
	}
	
	
}
