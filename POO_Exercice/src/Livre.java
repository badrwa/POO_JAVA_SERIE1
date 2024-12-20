
public class Livre{
		private String title;
		private String auteur;
		private Double prix;
		
		public Livre(String title, String auteur, Double prix) {
			super();
			this.title = title;
			this.auteur = auteur;
			this.prix = prix  ;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getAuteur() {
			return auteur;
		}

		public void setAuteur(String auteur) {
			this.auteur = auteur;
		}

		public Double getPrix() {
			return prix;
		}

		public void setPrix(Double prix) {
			this.prix = prix;
		}
		public void afficherDetails() {
			System.out.println(" Le livre title "+ title + " et l'auteur "+ auteur +" et le prix "+ prix +" DH "  );
		}
		
		
	}
