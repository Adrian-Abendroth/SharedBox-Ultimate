package controller;

import javax.swing.JOptionPane;
import model.Benutzer;
import view.LoginView;

public class UserAction {
 
 private Benutzer model;
 private LoginView view;
 
 public UserAction(Benutzer m, LoginView v) {
  model = m;
  view = v;
  initView();
 }
 
 public void initView() {
  view.getEmailTextfield().setText(model.getEmail());
  view.getPasswortTextfield().setText(model.getPasswort());
 }
 
 public void initController() {
  view.getVerifyLoginButton().addActionListener(e -> checkLogin());
  view.getEnd().addActionListener(e -> sayend());
 }
  
 private void checkLogin() {
	 String username = view.getEmailTextfield().getText();
	 String passwort = view.getPasswortTextfield().getText();
	 boolean test = Benutzer.Authenticate(username, passwort);
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