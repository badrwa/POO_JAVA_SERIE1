
public class Employés {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employe employe1= new Employe("badr", 2500);
		Employe employe2= new Employe("issam", 2100);
		Employe employe3= new Employe("israa", 3000);
		Manager manager1= new Manager("mostapha", 5000, 500);
//		create tablaux employe
		
		Employe[] employes= {employe1,employe2,employe3,manager1};
		System.out.println("info des employes");
		System.out.println();
		for (Employe employe : employes) {
			employe.afficherInfos();
			System.out.println();	
		}
		
	}

}
