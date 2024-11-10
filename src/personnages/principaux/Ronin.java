package personnages.principaux;

import personnages.Humain;

public class Ronin extends Humain {
	private int honneur;
	
	public Ronin(String nom, int argent, String boisson) {
		super(nom, argent, boisson);
		this.honneur = 1;
	}
	
	public void donner(int n, Commerçant c) {
		c.gagnerArgent(n);
		this.perdreArgent(n);
	}
	
	public void provoquer(Yakuza y) {
		if((2 * this.honneur) > y.getReputation()) {
			this.gagnerArgent(y.getArgent());
			this.honneur++;
			super.parler("J'ai gagné en duel à une yakuza");
		}
		else {
			this.honneur--;
			super.parler("J'ai perdu");
		}
	}
}
