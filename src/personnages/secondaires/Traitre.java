package personnages.secondaires;

import personnages.Humain;
import personnages.principaux.Commerçant;
import personnages.principaux.Samourai;

public class Traitre extends Samourai{
	private int traitrise;
	
	public Traitre(String nom, int argent, String boisson, String seigneur) {
		super(nom, argent, boisson, seigneur);
		this.traitrise = 0;
	}
	public void extorquer(Commerçant c) {
		if(this.traitrise < 3)	{
			gagnerArgent(c.getArgent());
			this.traitrise++;
			super.parler("Je suis un traitre et je viens d'extorquer un commerçant");
		}
		else {
			super.parler("Je ne peux plus extorquer! Je l'ai fait plein de fois");
		}
	}
	
	public void direBonjour() {
		super.direBonjour();
		super.parler("Mon niveau de traitrise est: " + this.traitrise);
	}
	
	public void faireLeGentil(Humain h, int argent) {
		super.parler("Voilà mon ami "+super.getNom()+". Je te donne "+this.getArgent());
		if(this.traitrise > 0) {
			this.traitrise -= (1/10 * this.getArgent());
		}
		else {
			super.parler("Niveau de traitrise très bas: "+this.traitrise);
		}
	}
}
