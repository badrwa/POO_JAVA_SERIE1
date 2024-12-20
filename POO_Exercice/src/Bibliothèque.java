
public class Bibliothèque {

	public static void main(String[] args) {
			// TODO Auto-generated method stub
		  	Livre livre1 = new Livre("Le Petit Prince", "Antoine de Saint-Exupéry", 10.99);
	        Livre livre2 = new Livre("1984", "George Orwell", 15.50);
	        Livre livre3 = new Livre("L'Alchimiste", "Paulo Coelho", 12.75);

	        // Affichage des détails des livres
	        System.out.println("Détails des livres dans la bibliothèque :");
	        livre1.afficherDetails();
	        System.out.println();
	        livre2.afficherDetails();
	        System.out.println();
	        livre3.afficherDetails();
	}

}
