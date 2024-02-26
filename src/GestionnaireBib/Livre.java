package GestionnaireBib;

public class Livre extends Bibliotheque {

	// Attributs
	String titre;
	String auteur;
	int isbn;
	boolean dispo;

	public Livre(String titre, String auteur,int isbn, boolean dispo) {
		this.setTitre(titre);
		this.setAuteur(auteur);
		this.setIsbn(isbn);
		this.setDispo(dispo);
	}

	// Getter et setters
	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	
	public boolean isDispo() {
		return dispo;
	}

	public void setDispo(boolean dispo) {
		this.dispo = dispo;
	}
	
	// Methodes
	@Override
	public String toString() {
		return "Titre : " + this.getTitre() + " | Auteur : " + this.getAuteur() + " | ISBN : " + this.getIsbn()+ " | Disponible : " + this.isDispo();
	}
	
	// TODO déplacer methode pour chercher un livre
	
	// afficher disponibilité
	public void disponibilite() {
		if (dispo == true) {
			System.out.println(this.getTitre() + " : disponible");
		} else if (dispo == false) {
			System.out.println(this.getTitre() + " : non disponible");
		}
	}
	
	// changer dispo
	public void emprunter() {
		setDispo(false);
	}
	
	public void rendre() {
		setDispo(true);
	}

	

	

	

}
