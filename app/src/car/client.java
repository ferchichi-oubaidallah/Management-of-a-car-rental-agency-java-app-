package car;

import java.util.Scanner;

public class client {

	private int cin;
	private String nom;
	private String prenom;
	private String adresse;
	
	
	
	public client() {
		super();
		// TODO Auto-generated constructor stub
	}
	public client(int cin, String nom, String prenom, String adresse) {
		super();
		this.cin = cin;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
	}
	public void creeclient() {
		Scanner s=new Scanner(System.in);
		int b;
			
		
		String ch;
		System.out.print("entrer cin");
		cin=s.nextInt();
		
		System.out.print("entrer nom");
		nom=s.next();
		System.out.print("entrer prenom");
		prenom=s.next();
		System.out.print("entrer adresse");
		adresse=s.next();
	}
public void afficherclient() {
		
		System.out.println("Num cin:"+cin);
		System.out.println("Nom"+nom);
		System.out.println("Prenom"+prenom);
		System.out.println("Adresse"+adresse);
}
		public void copierclient(client c) {
		  	  cin=c.cin;
		  	  nom=c.nom;
		  	  prenom=c.prenom;
		  	  adresse=c.adresse;
		  	 	}
	
	public int getCin() {
		return cin;
	}
	public void setCin(int cin) {
		this.cin = cin;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

}
