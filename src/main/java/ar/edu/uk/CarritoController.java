package ar.edu.uk;

import com.google.appengine.api.users.User;
import com.google.appengine.api.users.UserService;
import com.google.appengine.api.users.UserServiceFactory;

public class CarritoController {

	static UserService userService;
	
	public static User getCurrentUser(){
        return getUserService().getCurrentUser();
	}
	
	
	public static void createLoginURL(String URI){
		getUserService().createLoginURL(URI);
	}
	
	private static UserService getUserService(){
		if (userService == null){
			userService = UserServiceFactory.getUserService();
		} 
		return userService;
	}
}
