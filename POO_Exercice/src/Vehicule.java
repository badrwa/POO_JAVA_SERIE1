
public class Vehicule {
	private String marque;
	private Double vitesseMax;
	
	
	public Vehicule(String marque, Double vitesseMax) {
		super();
		this.marque = marque;
		this.vitesseMax = vitesseMax;
	}
	
	public Vehicule() {
		super();
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public Double getVitesseMax() {
		return vitesseMax;
	}

	public void setVitesseMax(Double vitesseMax) {
		this.vitesseMax = vitesseMax;
	}
	
	public void afficherDetails() {
		System.out.println("le vehicule marque "+marque+" et vitessemax "+vitesseMax);
	}
	
	
}
