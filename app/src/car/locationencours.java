package car;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Scanner;




public class locationencours {

	private ArrayList<location> tablocation;
	
	
	
	public locationencours() {
		 tablocation=new  ArrayList<location>();  
		
	}

public void afficher() {
	int i=0;
	if(tablocation.isEmpty()) {
		System.out.println("pas de location en cours");
	}else {
	for(i=0;i<tablocation.size();i++) {
		System.out.println("la location numero :"+i);
		tablocation.get(i).afficher();
	}
}}
public void afficherparclient(int cin) {
	boolean trouve=false;
          if(tablocation.size()>0) {
        	  
        	  for(int i=0;i<tablocation.size();i++) {
      			if(tablocation.get(i).getC().getCin()==cin) {
      				tablocation.get(i).afficher();
      				trouve=true;
      			}
      			       
      			}
        	  
        	if(trouve==false)  System.out.println("pas de location pour ce client.");
        		
        	  
          }
          else  System.out.println("tab de location vide.");
	
	
	
}
	public void ajoutloc(location l) {

		
		
		if((l.getV().getEtat().equals("disponible"))&&(l.getAvance()>0)){
			l.getV().setEtat("loue");
		
			tablocation.add(l);}
		else 
			System.out.println("location n'est pas effectuee.");}

	public int chercher (int cin,int matricule) {
		 boolean trouve=false;
		int i=0;
		while((i<tablocation.size())&&(!trouve))
		{ 
			if((tablocation.get(i).getC().getCin()==cin)&&(tablocation.get(i).getV().getMatricule()==matricule)) {
            trouve=true;}
            else 
				i++;			
		
		}
		if(trouve) {
			return i;
		}

		else 
			return -1;
	}

        public location suppression() {
        	location kaka=new location();
        	if(tablocation.isEmpty()) {
        		System.out.println("lite vide no ");
        		return kaka;
        	}else {
        	
        	location l=new location();
        	Scanner s=new Scanner(System.in);
        	System.out.println("donner matricule");
        	int mat,ncin;
        	mat=s.nextInt();
        	System.out.println("donner cin"); 
        	ncin=s.nextInt();
        	int in = 0, i=0;boolean trouve=false;
        	
        	if(this.chercher(ncin, mat)!=-1) {
        		LocalDate n = n=tablocation.get(this.chercher(ncin, mat)).getFin();
        		
        		
  			  if(LocalDate.now().compareTo(n)>0) {
  				tablocation.get(this.chercher(ncin, mat)).setretard(1);
                                  System.out.println("date de retour non respecter (il y a un retard).");
                  
           		 Period difference = Period.between(n, LocalDate.now());   
           	        
           		 System.out.print("Duree de retard:\n");   
           	     System.out.printf( "%d days, %d months and %d years",difference.getDays(),difference.getMonths(), difference.getYears()); 
           	  tablocation.get(this.chercher(ncin, mat)).setJours(difference.getDays());  
           	 tablocation.get(this.chercher(ncin, mat)).setMois(difference.getMonths());
         	 tablocation.get(this.chercher(ncin, mat)).setAnne(difference.getYears());
           	  }
           	     int a;
           	     do {
           	    	 System.out.print("donner l'etat de vehicule (1 si en bon etat 0 si non)."); a=s.nextInt();
           	     }while((a!=1)&&(a!=0));
           	  tablocation.get(this.chercher(ncin, mat)).getV().setirletat(a);
           	     
                  kaka=tablocation.get(this.chercher(ncin, mat));
        tablocation.remove(this.chercher(ncin, mat));	}
        	else {
        		System.out.println("location inexistant");
        	}
        
        	return kaka;}}}
