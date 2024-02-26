package GestionnaireBib;

import java.util.ArrayList;

public class Usager extends Personne {
	String nom;
	String prenom;

	public Usager(int numUtilisateur, String nom, String prenom) {
		super(numUtilisateur);
		this.setNom(nom);
		this.setPrenom(prenom);
	}

	// getter and setters
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	// METHODES
	@Override
	public String toString() {
		return "Prénom : " + this.getPrenom() + " | Nom : " + this.getNom() + " | Numéro d'utilisateur : "
				+ this.getNumUtilisateur();
	}

	

}
