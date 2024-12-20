
public class Employe {
	private String nom;
	private double salaire;
	
	public Employe(String nom, double salaire) {
		super();
		this.nom = nom;
		this.salaire = salaire;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getSalaire() {
		return salaire;
	}

	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}
	
	public void afficherInfos() {
		System.out.println("le nom de employe et "+nom+" et le salaire "+salaire+" DH");
	}

}
