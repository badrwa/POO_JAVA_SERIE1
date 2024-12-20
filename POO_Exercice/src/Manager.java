
public class Manager extends Employe {
	private double prime;

	public Manager(String nom, double salaire, double prime) {
		super(nom, salaire);
		// TODO Auto-generated constructor stub
		this.prime=prime;
	}

	public double getPrime() {
		return prime;
	}

	public void setPrime(double prime) {
		this.prime = prime;
	}
	@Override
	public void afficherInfos() {
		// TODO Auto-generated method stub
		System.out.println("le nom de employe et "+getNom()+" et le salaire "+getSalaire()+" DH et prime "+prime+" DH");
	}	
	
 
	
}
