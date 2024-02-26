package GestionnaireBib;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main extends Bibliotheque {

	Livre livre;
	String setTitre;
	String setAuteur;
	int setIsbn;
	boolean setDispo;
	Emprunts emprunts;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// TODO créer un nv livre
		System.out.println("Enregistrer un nouveau livre");

		Livre livre1 = new Livre("silo", "h howey", 123, true);
		Livre livre2 = new Livre("les fourmis", "b weber", 456, true);
		Livre livre3 = new Livre("fun home", "a bechdel", 789, true);

		// ajouter livres à la liste
		listeLivres.add(livre1);
		listeLivres.add(livre2);
		listeLivres.add(livre3);

		// afficher les livres
		System.out.println(listeLivres);

		// emprunter livre
		livre1.emprunter();
		livre1.disponibilite();

		// TODO appeler methode pour chercher un livre dans la bibliothèque
//		System.out.println("Rechercher un livre : ");
//		String livreDemande = scanner.nextLine();
//		for (int i = 0; i < listeLivres.size(); i++) {
//			if (listeLivres.get(i).getTitre().contains(livreDemande)
//					|| (listeLivres.get(i).getAuteur().contains(livreDemande))) {
//				System.out.println("Votre recherche peut correspondre à : ");
//				System.out.println(listeLivres.get(i++));
//			} else {
//				if (i == listeLivres.size() + 1) {
//					System.out.println("N'existe pas");
//				}
//			}
//		}

		// TODO nouvel usager
		Usager u1 = new Usager(001, "Mathieu", "Weaver");
		Usager u2 = new Usager(002, "Mireille", "Dali");

		Emprunts empU1 = new Emprunts(u1, livre1);
		Emprunts emp2U1 = new Emprunts(u1, livre3);

		Emprunts empU2 = new Emprunts(u2, livre2);

		listeEmprunts.add(empU1);
		listeEmprunts.add(emp2U1);
		listeEmprunts.add(empU2);
		System.out.println(listeEmprunts);

		// TODO methode pour créer nv objet emprunt + changer boolean Dispo

	}
}
