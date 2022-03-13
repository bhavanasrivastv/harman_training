package ques_five;

public class ans_five {
	public static void main(String[] args) {

		UserRegistration registration=new UserRegistration();
		
		try {
			registration.registerUser("raj", "usa");
		} catch (InvalidCountryException e) {
			System.out.println(e.getMessage());
		}
	}
}
