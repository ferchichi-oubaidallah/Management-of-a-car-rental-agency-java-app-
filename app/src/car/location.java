package car;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
import java.time.LocalDate;
import java.util.Date;
public class location {
	private vehicule v;
	private client c;
	private LocalDate debut;
	private LocalDate fin;
	private int prix;private int avance;
	private int retard;
	private int jours;
	private int anne;
	private int mois;
	
	
	
	
	public int getJours() {
		return jours;
	}
	public void setJours(int i) {
		this.jours = i;
	}
	public int getAnne() {
		return anne;
	}
	public void setAnne(int anne) {
		this.anne = anne;
	}
	public int getMois() {
		return mois;
	}
	public void setMois(int mois) {
		this.mois = mois;
	}
	
	
	public location() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void afficher() {
		

			
			v.affichervehicule();
			c.afficherclient();
			System.out.println("Date de debut de location:"+debut);
			System.out.println("Date de fin de location:"+fin);
			System.out.println("Prix de location:"+prix);
			System.out.println("Le montant d'avance:"+avance);
			
	}
	public void affichehis() {
		
		
		v.affichervehicule();
		c.afficherclient();
		System.out.println("Date de debut de location:"+debut);
		System.out.println("Date de fin de location:"+fin);
		System.out.println("Prix de location:"+prix);
		System.out.println("Le montant d'avance:"+avance);	System.out.println("Le duree de retard:");
		System.out.println("jours:"+jours);System.out.println("mois"+mois);System.out.println("anne:"+anne);
		System.out.println("l etat du voiture"+v.getirletat());
	}
	
public void retard() {
		
		if((anne==0)&&(mois==0)&&(jours==0))
			 System.out.print("pas de retard."); 
		else {
		 System.out.println("Duree de retard:\n");   
 	     System.out.printf( jours+ "jours"+mois +" mois et"+anne +"annes"); 
			
		}}
	public void copierloc(location l) {
		v.copiervehicule(l.getV());
		this.c.copierclient(l.getC());
		this.debut=l.debut;
		this.fin=l.fin;
		this.prix=l.prix;
		this.avance=l.avance;
		
		
	}
	public void cree(vehicule v, client c) {;
		int a,b,cc;
		this.v=v;
		this.c=c;
		Scanner s  = new Scanner(System.in);
		 System.out.println("entrer la date de debut");
	   	 do {
	   	System.out.println("anne:");
	   	a=s.nextInt();}while((a<1000)||(a>9999));
	   	do {
	   		
	   		System.out.println("mois:");
	   		b=s.nextInt();
	   		
	   	}while((b<1 )|| (b>12));
	   	
	   	if((b==2)) {
	   		
	   
	   	do {
	   		System.out.println("jour");
	   	    cc=s.nextInt();
	   		
	   	}while((cc<1 )||  (cc>28));	}
	   	else if((b==4)|| (b==6 ) ||(b==11 )|| (b==9 ) ){
	   		do {
		   		System.out.println("jour");
		   	    cc=s.nextInt();
		   		
		   	}while((cc<1 )|| (cc>30));	}
	   	else  {
	   		System.out.println("jour");
	   	    cc=s.nextInt();
	   		
	   	}while((cc<1 )||  (cc>31));
	   		
	  	 this.debut= LocalDate.of(a, b, cc);  
	    
	   	 System.out.println("entrer la date dez fin:");
	  	System.out.println("anne:");
	   	a=s.nextInt();
	   	do {
	   		System.out.println("mois:");
	   		b=s.nextInt();
	   		
	   	}while((b<1 )|| (b>12));
	   	
	   	if((b==2)) {
	   		
	   
	   	do {
	   		System.out.println("jour");
	   	    cc=s.nextInt();
	   		
	   	}while((cc<1 )||  (cc>28));	}
	   	else if((b==4)|| (b==6 ) ||(b==11 )|| (b==9 ) ){
	   		do {
		   		System.out.println("jour");
		   	    cc=s.nextInt();
		   		
		   	}while((cc<1 )|| (cc>30));	}
	   	else  {
	   		System.out.println("jour");
	   	    cc=s.nextInt();
	   		
	   	}while((cc<1 )||  (cc>31));
	   	   	 this.fin= LocalDate.of(a, b, cc); 
	   
	   	 System.out.println("entrer le prix:");
	   	 prix=s.nextInt();
	   	 System.out.println("entrer l'avance:) :");
	   	 avance=s.nextInt();
	    
		
	}
	
	public vehicule getV() {
		return v;
	}
	public void setV(vehicule v) {
		this.v = v;
	}
	public client getC() {
		return c;
	}
	public void setC(client c) {
		this.c = c;
	}
	public LocalDate getDebut() {
		return debut;
	}
	public void setDebut(LocalDate debut) {
		this.debut = debut;
	}
	public LocalDate getFin() {
		return fin;
	}
	public void setFin(LocalDate fin) {
		this.fin = fin;
	}
	public int getPrix() {
		return prix;
	}
	public void setPrix(int prix) {
		this.prix = prix;
	}
	
	public int getretard() {
		return retard;
	}
	public void setretard(int r) {
		this.retard = r;
	}
	
	public int getAvance() {
		return avance;
	}
	public void setAvance(int avance) {
		this.avance = avance;
	}
	
}
