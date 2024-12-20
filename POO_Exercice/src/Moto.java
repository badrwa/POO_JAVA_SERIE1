
public class Moto extends Vehicule {
	private String typeMoto;

	public Moto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Moto(String marque, Double vitesseMax , String typeMoto ) {
		super(marque, vitesseMax);
		// TODO Auto-generated constructor stub
		this.typeMoto=typeMoto;
	}

	public String getTypeMoto() {
		return typeMoto;
	}

	public void setTypeMoto(String typeMoto) {
		this.typeMoto = typeMoto;
	}
	
	@Override
	public void afficherDetails() {
		// TODO Auto-generated method stub
		System.out.println("le vehicule marque "+getMarque()+" et vitessemax "+getVitesseMax()+" et de type de moto "+typeMoto);

	}
	
	

}
