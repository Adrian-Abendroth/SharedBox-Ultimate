package controller;

import java.awt.event.ActionEvent;

import javax.swing.JOptionPane;
import model.Model;
import view.View;

public class Controller {
 
 private Model model;
 private View view;
 
 public Controller(Model m, View v) {
  model = m;
  view = v;
  initView();
 }
 
 public void initView() {
  view.getemailTextfield().setText(model.getemail());
  view.getpasswortTextfield().setText(model.getpasswort());
 }
 
 public void initController() {
  view.getverifyLoginButton().addActionListener(e -> checkLogin());
  view.getend().addActionListener(e -> sayend());
 }
  
 private void checkLogin() {
	 String username = view.getemailTextfield().getText();
	 String passwort = view.getpasswortTextfield().getText();
	 boolean test = Model.Authenticate(username, passwort);
	 /* Wenn der Benutzer und das Passwort uebereinstimmen, loge ein 
	  * und gehe zur App. Wenn Benutzer und Passwort falsch, dann 
	  * gebe Fehlermeldung aus
	 */
	 if (test == true){
		 System.out.println("Sie werden eingeloggt");
	 }
	 else {
		 System.out.println("Falscher Benutzername oder Passwort");
		 
	 }
 }

 private void sayend() {
  System.exit(0);
 }
 
}