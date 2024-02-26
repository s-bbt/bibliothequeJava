package GestionnaireBib;

import java.util.ArrayList;
import java.util.Scanner;

public class Bibliotheque {

	// liste de livres qui appartiennent à la bib
	static ArrayList<Livre> listeLivres = new ArrayList<Livre>(3);
	
	// liste de livres empruntés par des usagers
	static ArrayList<Emprunts> listeEmprunts = new ArrayList<Emprunts>();
	
	// Getter Setters
	public ArrayList<Emprunts> getListeEmprunts() {
		return listeEmprunts;
	}

	public void setListeEmprunts(ArrayList<Emprunts> listeEmprunts) {
		Bibliotheque.listeEmprunts = listeEmprunts;
	}

	public ArrayList<Livre> getListeLivres() {
		return listeLivres;
	}

	public void setListeLivres(ArrayList<Livre> listeLivres) {
		Bibliotheque.listeLivres = listeLivres;
	}
	
	// Méthodes
	
}