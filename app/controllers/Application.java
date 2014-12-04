package controllers;

import play.mvc.Before;
import play.mvc.Controller;
import play.mvc.With;

import java.util.*;

import models.*;

public class Application extends Controller {
	
	public static void index() {
		List<ServiceName> servicenames = ServiceName.findAll();
		render(servicenames);
	}

}