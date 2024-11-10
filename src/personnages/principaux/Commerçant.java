package personnages.principaux;

import personnages.Humain;

public class Commerçant extends Humain {
	
	public Commerçant(String nom, int argent) {
		super(nom, argent, "the");
	}
	
	public int seFaireExtorquer() {
		this.perdreArgent(getArgent());
		return this.getArgent();
	}
	
	public void recevoir(int n) {
		this.gagnerArgent(n);
	}
}

