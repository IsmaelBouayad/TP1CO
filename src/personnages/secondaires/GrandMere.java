package personnages.secondaires;

import java.util.Random;

import personnages.Humain;

public class GrandMere extends Humain{
	private int nbConnaissances;
	private Random r;
	private Humain [] memoire = new Humain[30];
	
	public GrandMere(String nom) {
		super(nom, 0 , "Tisane");
		this.nbConnaissances = 0;
		this.r = new Random();
	}
	
	 private String humainHasard() {
	        int typeAleatoire = r.nextInt(5); 
	        String typeHumain;

	        switch (typeAleatoire) {
	            case 0:
	                typeHumain = "Commerçant";
	                break;
	            case 1:
	                typeHumain = "Ronin";
	                break;
	            case 2:
	                typeHumain = "Samourai";
	                break;
	            case 3:
	                typeHumain = "Yakusa";
	                break;
	            case 4:
	                typeHumain = "Ninja";
	                break;
	            default:
	                typeHumain = "Inconnu"; 
	                break;
	        }
	        
	        return typeHumain;
	    }
	 
	
	 public void faireConnaissanceAvec(Humain humain) {
	        if (nbConnaissances < memoire.length) {
	            memoire[nbConnaissances] = humain;  
	            nbConnaissances++;
	            System.out.println(this.getNom() + " a fait connaissance avec " + humain.getNom());
	        } else {
	            System.out.println(this.getNom() + " ne peut pas se souvenir de plus de personnes !");
	        }
	    }
		 
	 public void ragoter() {
		 for(int i=0; i<nbConnaissances; i++) {
			 Humain humain = memoire[i];
			 if(humain instanceof Traitre) {
				 super.parler("Je pense que "+humain.getNom()+" est un traitre");
			 }
			 else {
				 String typeHumain = humainHasard();
				 super.parler("Je pense que "+humain.getNom()+" est un "+typeHumain);

			 }
			 
		 }
		 
	 }
}
