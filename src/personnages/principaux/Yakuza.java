package personnages.principaux;

import personnages.Humain;

public class Yakuza extends Humain {
	private String clan;
	private int reputation;
	
	public Yakuza(String nom, int argent, String boisson, String clan) {
		super(nom, argent, boisson);
		this.clan = clan; 
		this.reputation = 0;
	}
	
	public String getClan() {
		return this.clan;
	}
	
	public int getReputation() {
		return this.reputation;
	}
	
	public void extorquer(Commerçant c) {
		gagnerArgent(c.getArgent());
		this.reputation++;
		super.parler("Je viens d'extorquer un commerçant");
	}
	
	public void gagnerDuel() {
		this.reputation++;
		super.parler("Je viens de gagner un duel");
	}
	
	public int perdreDuel() {
		this.perdreArgent(getArgent());
		this.reputation--;
		super.parler("Je viens de perdre");
		return this.getArgent();
	}
	
	public void direBonjour() {
		super.direBonjour();
		System.out.println();
		super.parler("J'appartiens au clan: "+this.clan);
	}
}

