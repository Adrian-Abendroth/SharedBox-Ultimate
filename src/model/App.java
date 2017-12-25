package model;


import controller.Controller;
import view.View;

public class App {
	 
	 public static void main(String[] args) {
	  // Assemble all the pieces of the MVC
	  Model m = new Model("Max@Mustermann.de", "12345");
	  View v = new View("SharedBox-Ultimate");
	  Controller c = new Controller(m, v);
	  c.initController();
	 }
	 
	}