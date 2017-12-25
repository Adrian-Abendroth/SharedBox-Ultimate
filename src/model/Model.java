package model;
public class Model {
	 
	// attributs 
	protected String nachname;
	protected String vorname;
	protected String email;
	protected String passwort;
	protected String geschlecht;
	protected int speicherplatz;
	protected boolean werbung;
	
	// methods 
	public Model(String email, String passwort) {
		this.email = email;
		this.passwort = passwort;
	 }
	 
	 public static boolean Authenticate(String username, String password) {
	        // hardcoded username and password
	        if (username.equals("Max@Mustermann.de") && password.equals("12345")) {
	            return true;
	        }
	        return false;
	    }
	 
	 /******* Getter ******* */
	 public String getemail() {
	  return email;
	 }
	 
	 public void setemail(String email) {
	  this.email = email;
	 }
	 
	 public String getpasswort() {
	  return passwort;
	 }
	 
	 public void setpasswort(String passwort) {
	  this.passwort = passwort;
	 }
	 
	}