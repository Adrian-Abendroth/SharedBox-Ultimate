package model;

public class Benutzer {
	// attributs 
	protected String nachname;
	protected String vorname;
	protected String email;
	protected String passwort;
	protected String geschlecht;
	protected int speicherplatz;
	protected boolean werbung;
	
	// methods
	
	 public static boolean Authenticate(String username, String password) {
	        // hardcoded username and password
	        if (username.equals("Adrian") && password.equals("1337")) {
	            return true;
	        }
	        return false;
	    }
	 
	 /******* Getter ******* /
	 
	 /**
	  * @return nachname
	  */
	 public String getNachname() {
		 return nachname;
	 }
	 
	 /**
	  * @return vorname
	  */
	 public String getVorname() {
		 return vorname;
	 }
	 
	 /**
	  * @return email
	  */
	 public String getemail() {
		 return email;
	 }
	 
	 /**
	  * @return passwort
	  */
	 public String getPasswort() {
		 return passwort;
	 }
	 
	 /**
	  * @return geschlecht
	  */
	 public String getGeschlecht() {
		 return geschlecht;
	 }
	 
	 /**
	  * @return speicherplatz
	  */
	 public int getSpeicherplatz() {
		 return speicherplatz;
	 }
	 
	 /**
	  * @return werbung
	  */
	 public boolean getWerbung() {
		 return werbung;
	 }
	 
	 /******* Getter *******/
	 
	 public void setNachname(String name) {
		 this.nachname = name;
	 }
	 
	 public void setVorname(String vorname) {
		 this.vorname = vorname;
	 }
	 
	 public void setEmail(String email) {
		 this.email = email;
	 }
	 
	 public void setPasswort(String passwort) {
		 this.passwort = passwort;
	 }
	 
	 public void setGeschlecht(String geschlecht) {
		 this.geschlecht = geschlecht;
	 }
	 
	 public void setSpeicherplatz(int speicherplatz) {
		 this.speicherplatz = speicherplatz;
	 }
	 
	 public void setWerbung(boolean werbung) {
		 this.werbung = werbung;
	 }
	 


	
	
}
