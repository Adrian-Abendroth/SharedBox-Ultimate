// imports packages
package model;

import controller.UserAction;
import view.LoginView;

/*  MainApp where main-programm is started to assemble app */
public class MainApp {
	 
	 public static void main(String[] args) {
	  // Assemble all the pieces of the Model-View-Controller (Benutzer, LoginView, UserAction)
	  Benutzer m = new Benutzer("Max@Mustermann.de", "12345");
	  LoginView v = new LoginView("SharedBox-Ultimate");
	  UserAction c = new UserAction(m, v);
	  c.initController();
	 }
	 
	}