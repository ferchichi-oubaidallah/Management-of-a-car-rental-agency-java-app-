package car;
import java.util.Scanner;


public class vehicule {
	 private int   matricule;
	 private String constructeur;
	 private String marqueCommerciale;
	 private String etat;
	 private int irletat;
	 
	 public vehicule() {
		 matricule=0;
		 constructeur="";
		 marqueCommerciale="disponible";
		 etat="";
	 }
	 public void copiervehicule(vehicule v) {
  	   matricule=v.matricule;
  	   constructeur=v.constructeur;
  	   marqueCommerciale=v.marqueCommerciale;
  	   etat=v.etat;
  	 	}
	 public void vehiculecree() {
		 
		 Scanner s = new Scanner(System.in);
		 System.out.println("donner matricule");
		 this.matricule=s.nextInt();
		 System.out.println("donner constructeur");
         this.constructeur=s.next();
		 System.out.println("donner marque commerciale");
         marqueCommerciale=s.next();
		 
         do {
      		  System.out.println("entrer l'Etat du vehicule( disponible , Loue  ou en cours de reparation ):");
      	 this.etat=s.nextLine();
      	 }while((!(etat.equals("disponible")) && !(etat.equals("loue"))&& !(etat.equals("en cours de reparation"))))        ;
      	
	 }
	 public int getMatricule() {
		return matricule;
	}
	public void setMatricule(int matricule) {
		this.matricule = matricule;
	}
	
	 public int getirletat() {
			return irletat;
		}
		public void setirletat(int irletat) {
			this.irletat = irletat;
		}
	
	public String getConstructeur() {
		return constructeur;
	}
	public void setConstructeur(String constructeur) {
		this.constructeur = constructeur;
	}
	public String getMarqueCommerciale() {
		return marqueCommerciale;
	}
	public void setMarqueCommerciale(String marqueCommerciale) {
		this.marqueCommerciale = marqueCommerciale;
	}
	public String getEtat() {
		return etat;
	}
	public void setEtat() {
		String x;
		Scanner s=  new Scanner(System.in);
		System.out.println("donner eTAT (disponible ,loue,en cours de reparation");
		x=s.next();
		this.etat = x;
	}
	public void setEtat(String  s) {
		
		this.etat = s;
	}
	public  void affichervehicule() {
		 System.out.println("le Matricule est:"+matricule);
    	 System.out.println("le Constructeur :"+constructeur);
    	 System.out.println("Marque commerciale :"+marqueCommerciale);
    	 System.out.println("l'Etat du vehicule:"+etat);
	 }
	 
	 
}
