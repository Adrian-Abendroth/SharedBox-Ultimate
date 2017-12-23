package model;

public class LoginMain {
	
	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
	    // TODO code application logic here
	   Benutzer benutzerObjekt = new Benutzer();
	   benutzerObjekt.setNachname("test");
	   benutzerObjekt.setPasswort("ola");
	   System.out.println(benutzerObjekt.getPasswort());
	   
	   
	   
	}

}
