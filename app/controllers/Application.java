package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

//@With(Secure.class)
public class Application extends Controller {
	
	@Before
	static void setConnectedUser() {
		if(Secure.Security.isConnected()) {
			User user = User.find("byEmail", Secure.Security.connected()).first();
			renderArgs.put("user", user.fullname);
		}
	}
	
	public static void index() {
		List<ServiceName> servicenames = ServiceName.findAll();
		render(servicenames);
	}

}