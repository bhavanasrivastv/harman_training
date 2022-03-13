package ques_five;

public class UserResgistration {
	public void registerUser(String username,String userCountry)
			throws InvalidCountryException {
		if(userCountry.equals("india")) {
			System.out.println("successful registration of user");
		}else
			throw new InvalidCountryException("invalid country name : "+
		userCountry+" please provide india");
	}
}

