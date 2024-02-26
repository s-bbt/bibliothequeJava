//package GestionnaireBib;
//
//import java.util.Arrays;
//import java.util.Scanner;
//import GestionnaireBib.Bilbliotheque.Livre;
//
//public class nouveauLivre extends Livre {
//
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		String nvLivre;
//		String ouiNon = "";
//		System.out.println("Enregistrer un nouveau livre");
//		String[][] livresDispo = { { null, null, }, { null, null, } };
//
//		// agit sur la ligne
//		for (int i = 0; i < livresDispo.length; i++) {
//			// agit sur la colonne
//			System.out.println("Entrer titre puis appuyer sur entrée. Entrer auteur puis appuyer sur entrée : ");
//			for (int line = 0; line < livresDispo[i].length; line++) {
//				livresDispo[i][line] = scanner.nextLine();
//			}
//		}
//		// afficher le tableau qui vient d'être créé
//		System.out.println("Voulez-vous afficher la bibliothèque ? ");
//		ouiNon = scanner.nextLine();
//		if (ouiNon.equals("oui")) {
//			System.out.println("Livres dispo : ");
//			System.out.println(Arrays.deepToString(livresDispo));
//		} else {
//			System.out.println("Ok bye");
//		}
//
//		// chercher un livre dans la bibliothèque
//		System.out.println("Rechercher un livre. Entrer le titre ou l'auteur du livre :");
//		String rechercheLivre = scanner.nextLine();
//	
//		int line = 0;
//		for (int i = 0; i < livresDispo.length; i++) {
//			if (rechercheLivre.equalsIgnoreCase(livresDispo[i][line])) {
//				System.out.println(ArraystoString(livresDispo[i][line]));
//			} else {
//				System.out.println("N'existe pas");
//			}
//		}
//		
//	}
//
//	private static char[] ArraystoString(String livresDispo) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//}