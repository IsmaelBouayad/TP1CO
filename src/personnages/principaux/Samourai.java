package personnages.principaux;

public class Samourai extends Ronin {
	private String seigneur;
	
	public Samourai(String nom, int argent, String boisson, String seigneur) {
		super(nom, argent, boisson);
		this.seigneur = seigneur;
	}
	
	public void direBonjour() {
		super.direBonjour();
	}
	
	public void boire(String b) {
		super.boire();
	}
	
	public static void main(String[] args) {
		Ronin musaichi = new Samourai("Akimoto", 20, "the", "Miyamoto");
		
		musaichi.boire();
		//musaichi.boire("Café");
		musaichi.direBonjour();
	}

}
