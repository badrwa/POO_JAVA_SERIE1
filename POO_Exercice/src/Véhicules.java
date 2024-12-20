
public class Véhicules {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Voiture voiture1 = new Voiture("GT gutiulla 2023",(double) 400,20);
		
		Moto moto1 = new Moto("GTR 2023",(double) 200,"GTR");
		
		System.out.println("Détails des vehicule :");
		voiture1.afficherDetails();
		System.out.println();
		moto1.afficherDetails();
		

	}

}
