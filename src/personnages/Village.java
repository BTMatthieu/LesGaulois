package personnages;

public class Village {
	private String nom;
	private Chef chef;
	private Gaulois[] villageois;
	private int nbVillageois = 0;
	private int nbVillageoisMaximum;
	
	public Village(String nom, int nbVillageoisMaximum) {
		this.nom = nom;
		this.nbVillageoisMaximum = nbVillageoisMaximum;
		this.villageois = new Gaulois[nbVillageoisMaximum];
	}

	public void setChef(Chef chef) {
		this.chef = chef;
	}

	public String getNom() {
		return nom;
	}
	
	public void ajouterHabitant(Gaulois gaulois) {
		villageois[nbVillageois] = gaulois;
		nbVillageois += 1;
	}
	
	public Gaulois trouverHabitant(int numHabitant) {
		return villageois[numHabitant];
	}
	
	public void afficherVillageois() {
		System.out.println("Dans " + nom + " du chef " + chef +" vivent les légendaires gaulois : ");
		for (int i = 0; i < nbVillageois; i++) {
			System.out.println("- " + villageois[i].getNom());
		}
	}
	
	public static void main(String[] args) {
		Village irreductible = new Village("Village des Irréductibles", 30);
//		Gaulois gaulois = irreductible.trouverHabitant(30);
//		 la recherche est en dehors du tableau
		Chef abraracourcix = new Chef("Abraracourcix", 6, irreductible);
		irreductible.setChef(abraracourcix);
		Gaulois asterix = new Gaulois("Astérix", 8);
		irreductible.ajouterHabitant(asterix);
//		Gaulois gaulois = irreductible.trouverHabitant(1);
//		System.out.println(gaulois);
//		null car asterix est à la position 0 et non 1
		Gaulois obelix = new Gaulois("Obélix", 25);
		irreductible.ajouterHabitant(obelix);
		irreductible.afficherVillageois();
		
	}

}
