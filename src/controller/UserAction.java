// imports packages
package controller;

import java.awt.BorderLayout;
import java.awt.GraphicsConfiguration;

import javax.swing.JFrame;

import model.Benutzer;
import view.LoginView;
import view.MainView;

public class UserAction {
 /* **** attributs **** */
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
	  * und gehe zur Main View, schließe dabei das Login-Fenster. Wenn Benutzer und Passwort falsch, dann 
	  * gebe Fehlermeldung aus
	 */
	 if (test == true){
		 System.out.println("Sie werden eingeloggt");
		 new MainView("MainView");
	 }
	 else {
		 System.out.println("Falscher Benutzername oder Passwort");
		 
	 }
 }
 
 private void sayend() {
  System.exit(0);
 }
 
}