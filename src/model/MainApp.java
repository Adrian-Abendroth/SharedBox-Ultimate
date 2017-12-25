package model;


import controller.UserAction;
import view.LoginView;

public class MainApp {
	 
	 public static void main(String[] args) {
	  // Assemble all the pieces of the MVC
	  Benutzer m = new Benutzer("Max@Mustermann.de", "12345");
	  LoginView v = new LoginView("SharedBox-Ultimate");
	  UserAction c = new UserAction(m, v);
	  c.initController();
	 }
	 
	}