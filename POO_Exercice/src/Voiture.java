
public class Voiture extends Vehicule  {
	private int nombrePortes;



	public Voiture(String marque, Double vitesseMax , int nombrePortes) {
		super(marque, vitesseMax);
		// TODO Auto-generated constructor stub
		this.nombrePortes= nombrePortes;
		
	}

	public int getNombrePortes() {
		return nombrePortes;
	}

	public void setNombrePortes(int nombrePortes) {
		this.nombrePortes = nombrePortes;
	}
	
	@Override
	public void afficherDetails() {
		System.out.println("le vehicule marque "+getMarque()+" et vitessemax "+getVitesseMax()+" et le nombrePortes "+nombrePortes);
	}
	
	

}
