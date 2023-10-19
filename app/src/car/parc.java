package car;
import java.util.ArrayList;
import java.util.Scanner; 




public class parc {
	private ArrayList<vehicule> tablevehicule; 
	
	
	public parc(){
		tablevehicule=new ArrayList<vehicule>();
		
	}
	
	public void afficherVL() {
		if(tablevehicule.size()>0) {
			
		
		for(int i=0;i<tablevehicule.size();i++) {
			if(tablevehicule.get(i).getEtat().equals("loue"))
			(tablevehicule.get(i)).affichervehicule();
		}}
		else  System.out.println("pas de vehicule en location");
			
		
	}
	public void afficherdis() {
		if(tablevehicule.size()>0) {
			
		
		for(int i=0;i<tablevehicule.size();i++) {
			if(tablevehicule.get(i).getEtat().equals("disponible"))
			(tablevehicule.get(i)).affichervehicule();
		}}
		else  System.out.println("pas de vehicule en location");
			
		
	}
	
	
	public void afficherer() {
		if(tablevehicule.size()>0) {
			
		
		for(int i=0;i<tablevehicule.size();i++) {
			if(tablevehicule.get(i).getEtat().equals("en cours de reparation"))
			(tablevehicule.get(i)).affichervehicule();
		}}
		else  System.out.println("pas de vehicule en location");
			
		
	}
	public void afficher() {
		
		if(tablevehicule.isEmpty()) {
			System.out.println("pas d elements ");
		}else {
		for(int i=0;i<tablevehicule.size();i++) {
			tablevehicule.get(i).affichervehicule();
			
		}
	}}
	public void ajouter() {
		vehicule a=new vehicule();
		parc par=new parc();
		par.setTabvehicule(tablevehicule);
		
		a.vehiculecree();
		
		int x=a.getMatricule();
		if(this.dejaex(a.getMatricule())==false)
			tablevehicule.add(a);	
			else 
				System.out.println("ce matricule deja existe!");
		}
	public ArrayList<vehicule> getTabvehicule() {
		return tablevehicule;
	}
	public void setTabvehicule(ArrayList<vehicule> tabvehicule) {
		this.tablevehicule = tabvehicule;
	}
	
	
	public void suppr()  {
		int i=0 ;boolean test=false;
		Scanner s =new Scanner(System.in);
		int a;
		System.out.println("donner matricule");
		a=s.nextInt();
		if(tablevehicule.isEmpty()) {
			System.out.println("pas delements pour supprimer");
		}else {
		
		while( (i<tablevehicule.size())&&(test==false) ) {
		if(	tablevehicule.get(i).getMatricule()== a) {
			tablevehicule.remove(i);
			test=true;
			}
		
		else i++;}
		}}
	public boolean dejaex(int mat) {
		boolean trouve=false;
		if(tablevehicule.size()>0) {
		for(int i=0;i<tablevehicule.size();i++) {
			if(tablevehicule.get(i).getMatricule()==mat)
				trouve=true;}}
		return trouve;
	}
	
	public int find(int a) {
		int i=0,z=-1 ;boolean test=false;
		while( (i<tablevehicule.size())&&(test=false) ) {
		if(	tablevehicule.get(i).getMatricule()== a) {
			
			test=true;
		z=i;
		
	}else {
		i++;
	}}
		return z;
}
	
        public void modifieretat() {
        	int i=0, a,z;boolean trouve=false;
        	Scanner  s =new Scanner(System.in);
        	System.out.println("donner matricule ");
        	a=s.nextInt();
        	while( (i<tablevehicule.size())&&(!trouve) ) { 
    			if(tablevehicule.get(i).getMatricule()==a) {
    				
    			
    			tablevehicule.get(i).setEtat();
    			trouve=true;}
    			else 
    				i++;
    		
    	}
        	
        }
        public vehicule get(int a) {
        	return tablevehicule.get(a);
        }

public int vexist(int a) {
	int i=0;boolean t=false;
	if(tablevehicule.isEmpty()) {
		System.out.println("tab vide ");
		return -1;
	}else {
		while(i<tablevehicule.size()&&(!t)) {
			if(tablevehicule.get(i).getMatricule()==a) {
				t=true;
				
			}else {
				i++;
			}
		}
	if(t) {return i;}
	else return -1;}
}
}
