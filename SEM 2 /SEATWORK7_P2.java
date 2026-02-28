class PasswordException extends Exception {
	public PasswordException(String message) {
		super(message);
	}
}

public class SEATWORK7_P2 {
	
	static void checkPassword(String password) throws PasswordException {
		if (password.length() < 8) {
			throw new PasswordException("Password must contain 8 characters or above");
		} else { 
		System.out.println("Password Accepted");
		}
	}
	
	public static void main (String[]args) {
		try {
			checkPassword("IHateNikkers");
		} catch (PasswordException e) {
			System.out.println("User-Defined Exception:" + e.getMessage());
		}
    
    }
}
