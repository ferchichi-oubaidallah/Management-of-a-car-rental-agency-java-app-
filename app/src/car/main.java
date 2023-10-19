package car;


import java.util.Date;
import java.util.Scanner;



public class main {
	
	


	public static void main(String[] args) {
		
	/*	parc pi=new parc();vehicule v =new vehicule();v.vehiculecree();vehicule c =new vehicule();c.vehiculecree();
		vehicule m =new vehicule();m.vehiculecree();
		
		 
		 pi.ajouter(v);
		 pi.ajouter(c);      ;; 
		 pi.ajouter(m);
		 int a=pi.vexist(22);
      System.out.println(a);

	
	
	vehicule r=new vehicule();
	r.vehiculecree();
	
	
	pi.ajouter(r);
	pi.afficher();
	
	location he=new location();
	client c =new client();
	c.creeclient();
	location l=new location();
	l.cree(v, c);
	
	
	pa.ajoutloc(l);
	pa.afficher();
	location n=new location();
	n=pa.suppression();
	
	lochis jo=new lochis();
	jo.adding(n);
	jo.affichertt();
	*/
		lochis boost=new lochis();
		parc pi=new parc();
locationencours pa=new locationencours();
		int choix,choixx;
		Scanner s=new Scanner(System.in);
		do {
			
			 do {
	        	 System.out.println("1-Gestion du Parc de l�Agence: ");
	        	 System.out.println("2-Gestion Locations:  ");
	        	 System.out.println("3-Statistiques:  ");
	        	 System.out.println("4-quitter ");
	        	 choix=s.nextInt();
	        
	         }while  ((choix!=4)&&(choix!=3)&&(choix!=2)&&(choix!=1));
	         if(choix==1) {
	        	 do {
	        		 do {
	        			 System.out.println("1. Nouvelle acquisition (Ajout d’un véhicule)");
	        			 System.out.println("2. Modification de l’Etat d’un Véhicule ");
	        			 System.out.println("3. Suppression d’un Véhicule");
	        			 System.out.println("4. Consultation Parc (tous les véhicules)");
	        			 System.out.println("5. Liste des véhicules loués") ;
	        			 System.out.println("6. Liste des véhicules en cours de réparation");
	        			 System.out.println("7. Liste des véhicules disponibles");
	        			 System.out.println("8. retour au menu principal");
	        		choixx=s.nextInt();
	        					        		 }while((choixx!=1)&&(choixx!=2)&&(choixx!=3)&&(choixx!=4)&&(choixx!=5)&&(choixx!=6)&&(choixx!=7)&&(choixx!=8));
	        			 switch(choixx) {
	        			 case 1:
	        				
	        					pi.ajouter();
	        					break;
	        			 case 2:
	        				 pi.modifieretat();
	        				    break;
	        			 case 3 :
	        				 pi.suppr();	 
	                           break ;
	        			 case 4:
	        				 pi.afficher();
	        			      break;
	        			 case 5:
	        				 pi.afficherVL();
	        				 break;
	        			 case 6:
	        				 pi.afficherer();
	        				 break ;
	        			 case 7 :
	        				 pi.afficherdis();
	        				 break;
	        			 }
	        	 }while(choixx!=8);
	        	 
	         }
	         
	         else if(choix==2) {
	        	 do {
	        		 do {
	        			 System.out.println("1. Nouvelle Location (Ajout d’une location)");
	        			 System.out.println("2. Fin de Location (Suppression) ");
	        			 System.out.println("3. Consultation des locations en cours");
	        			 System.out.println("4. Consultation des Véhicules Loués par un client");
	        			 System.out.println("5. retour au menu principal");
	        			 choixx=s.nextInt();
	        		 }while((choixx!=4)&&(choixx!=3)&&(choixx!=2)&&(choixx!=1)&&(choixx!=5));
	        		 
	        		 switch(choixx) {
	        		 case 1:
	        			/* location lo=new location();

	        			 Scanner r=new Scanner(System.in);int a;
	        			 client l =new client();
	        			 l.creeclient();
	        			 System.out.println("donner le matricule ");
	        			 a=r.nextInt();
	        			 if(pi.vexist(a)!=-1) {
	        				 vehicule io=new vehicule();
	        				
	        				 lo.cree(pi.get(pi.vexist(a)),l);
	        				 
	        			 }else { System.out.println("voiture inexistant ");
	        			pa.ajoutloc(lo);}
	        			*/location lo=new location();

                        Scanner r=new Scanner(System.in);int a;
                        client l =new client();
                        l.creeclient();
                        System.out.println("donner le matricule ");
                        a=r.nextInt();
                        if(pi.vexist(a)!=-1) {


                            lo.cree(pi.get(pi.vexist(a)),l);
                            pa.ajoutloc(lo);}
                        else  System.out.println("voiture inexistant dans parking ");
	        				break;
	        		 case 2:
	        			location his=new location();
	        			his=pa.suppression();
	        				boost.adding(his);	
	        		 break ;
	        		 case 3:
	        			 pa.afficher();
	        			 break;
	        		 case 4:
	        			 System.out.println("donner le cin");int gh;
	        			 Scanner ls=new Scanner(System.in);
	        			 gh=ls.nextInt();
	        			 pa.afficherparclient(gh);
	        			 break;
	        		 }
	        		 
	        		 
	        	 }while(choixx!=5); }
	      
	         else if(choix==3) {
	        	 do {
	        		 do {   System.out.println("1. Nombre de locations pour une période déterminée");
	        			 System.out.println("2. Total des revenus pour une période déterminé");
	        			 System.out.println("3. Liste des clients à risque (Retard / mauvais état de véhicules rendus)");
	        			 System.out.println("4. retour menu principal");
	        			 choixx=s.nextInt();
	        		 }while((choixx!=4)&&(choixx!=3)&&(choixx!=2)&&(choixx!=1));
	        		 
	        		 switch(choixx) {
	        		 case 1:
	        		 boost.locdete();
	        		 break ;
	        		 case 2:boost.totr();
	        			 break;
	        		 case 3:
	        			 boost.listeclientr();
	        		 }
	        		 
	        		 
	        	 }while(choixx!=4);
	        	 
	         }
	         
	         
	         
		}while(choix!=4);
		
		
}	
}