package car;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;


public class lochis {
	private ArrayList<location>tabhis;

	public lochis() {
		tabhis=new ArrayList<location>();
	}

	public ArrayList<location> getTabhis() {
		return tabhis;
	}

	public void setTabhis(ArrayList<location> tabhis) {
		this.tabhis = tabhis;
	}

	
	public void adding(location l) {
		
		tabhis.add(l);
	}

	public location get (int i) {
		return tabhis.get(i);}
	
	
	public void affichertt() {
		
			int i=0;
			if(tabhis.isEmpty()) {
				System.out.println("pas de location en historique");
			}else {
			for(i=0;i<tabhis.size();i++) {
				tabhis.get(i).afficher();
			}
		}
	}
	
	public ArrayList<location> gettTabhis() {
		return tabhis;
	}


	public void settabhis(ArrayList<location> tab) {
		this.tabhis = tab;
	}
	public void locdete() {
		boolean trouve=false;
		int i=0;
		LocalDate dd1,dd2;
		lochis l=new lochis();
		location lH=new location();
	    Scanner s=new Scanner(System.in);
		l.settabhis(tabhis);
		int a,b,cc;
		LocalDate deb,fin;
		 System.out.println("entrer la date de debut");
	   	 do {
	   	System.out.println("anne:");
	   	a=s.nextInt();}while((a<2020)||(a>2022));
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
	   	deb= LocalDate.of(a, b, cc);  
	    
	   	 System.out.println("entrer la date de fin:");
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
	   	   	fin= LocalDate.of(a, b, cc); 
	   	   	
		if(tabhis.size()>0) {
			while(i<tabhis.size()) {
				
			      dd1=l.get(i).getDebut();
			      dd2=l.get(i).getFin();
				if(((dd1.compareTo(deb))>=0)&&((dd2.compareTo(fin))<0)) {
					trouve=true;
					lH=l.get(i);
			             lH.affichehis();
			}
				 i++;
			
			}
			if(trouve==false)  System.out.println("pas de location disponible dans cette periode");
		}
			
		
		else System.out.println("Liste de historique vide!");
			
			
	}
	
	public void listeclientr() {int i=0;
		if(tabhis.isEmpty()) {
			System.out.println("la liste est vide (client retard ou irletat et 0)");
		}
		else { while(i<tabhis.size()){
			
			if((tabhis.get(i).getretard()==1)||(tabhis.get(i).getV().getirletat()==0)) {
				tabhis.get(i).affichehis();
				i++;
			}else i++;
		}}
		
	}
	public void totr() {Scanner  s=new Scanner (System.in);
	LocalDate comp1,comp2;
	
	int i=0;

	lochis l=new lochis();
	location lo=new location();
    
    int rev=0;
	l.setTabhis(tabhis);
	
	
	if(!(tabhis.isEmpty())) {
		int x,y,z,a1,b1,cc1;
		LocalDate deb,fin;
	  	 
	  	 System.out.println("entrer la date de debut");
	  	 do {
	  	System.out.println("anne:");
	  	x=s.nextInt();}while((x<2000)||(x>2023));
	  	do {
	  		
	  		System.out.println("mois:");
	  		y=s.nextInt();
	  		
	  	}while((y<1 )|| (y>12));
	  	
	  	if((y==2)) {
	  		
	  
	  	do {
	  		System.out.println("jour");
	  	    z=s.nextInt();
	  		
	  	}while((z<1 )||  (z>28));	}
	  	else if((y==4)|| (y==6 ) ||(y==11 )|| (y==9 ) ){
	  		do {
		   		System.out.println("jour");
		   	    z=s.nextInt();
		   		
		   	}while((z<1 )|| (z>30));	}
	  	else  {
	  		System.out.println("jour");
	  	    z=s.nextInt();
	  		
	  	}while((z<1 )||  (z>31));
	  		

	   	deb= LocalDate.of(x, y, z);  
	   	
	   	
	    
		 System.out.println("entrer la date de fin:");
	   	 do {
	  	System.out.println("anne:");
	   	a1=s.nextInt();}while(((a1<1000)||(a1>9999))||(a1<x ));
	   	 
	   	 
	   	 
	   	 if(a1==x) {
	   		  	do {
	   		System.out.println("mois:");
	   		b1=s.nextInt();
	   		
	   	}while(((b1<1 )|| (b1>12))||(b1<y ));
	   	
	   	 }
	   	 else 
	   		do {
		   		System.out.println("mois:");
		   		b1=s.nextInt();
		   		
		   	}while((b1<1 )|| (b1>12)); 
	   	 
	   		if((b1==y)&&(a1==x)){  
	   		
	   		if((b1==2)) {

	   	do {
	   		System.out.println("jour");
	   	    cc1=s.nextInt();
	   		
	   	}while(((cc1<1 )||  (cc1>28))||(cc1<z ));	}
	   	else if((b1==4)|| (b1==6 ) ||(b1==11 )|| (b1==9 ) ){
	   		do {
		   		System.out.println("jour");
		   	    cc1=s.nextInt();
		   		
		   	}while(((cc1<1 )|| (cc1>30))||(cc1<z ));	}
	   	else  {
	   		do {
	   			
	   		
	   
	   		System.out.println("jour");
	   	    cc1=s.nextInt();
	   		
	   	}while(((cc1<1 )||  (cc1>31))||(cc1<z ));
	   	}
	   	}
	   	
	   	
	   	else {
	   			   	
	   	if((b1==2)) {
	   		
	   
	   	do {
	   		System.out.println("jour");
	   	    cc1=s.nextInt();
	   		
	   	}while((cc1<1 )||  (cc1>28));	}
	   	else if((b1==4)|| (b1==6 ) ||(b1==11 )|| (b1==9 ) ){
	   		do {
		   		System.out.println("jour");
		   	    cc1=s.nextInt();
		   		
		   	}while((cc1<1 )|| (cc1>30));	}
	   	else  {
	   		do {
	   		System.out.println("jour");
	   	    cc1=s.nextInt();
	   		
	   	}while((cc1<1 )||  (cc1>31));
	   	}}
	   	fin= LocalDate.of(a1, b1, cc1);
	   	boolean tt=false;int revenue=0;
	   comp1=tabhis.get(i).getDebut();
	      comp2=tabhis.get(i).getFin();
   	   	while( i<tabhis.size()){
   	   	if(((comp1.compareTo(deb))>0)&&((comp2.compareTo(fin))<0)) {
   	   		tt=true;
   	   		revenue+=l.get(i).getAvance();
   	   	revenue+=l.get(i).getPrix();
   	   	}
   	   		i++;
   	   	}
   	 if(tt==true)  System.out.println("le totale des revenue dans cette periode est:"+revenue+"dtn");
		if(tt==false)  System.out.println("pas de location disponible dans cette periode");
   		  }

else {
	System.out.println("historique  est  vide");}
}}
