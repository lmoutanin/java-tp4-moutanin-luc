package re.moutanin.luc;

import java.util.Scanner;

public class Exercice1 {

	// Objet Scanner pour la saisie utilisateur

	static Scanner monScanner = new Scanner(System.in);

	// Variable pour stocker l'entier saisi par l'utilisateur

	static int nombreEntier;
	// Variable pour stocker la valeur d'ajustement

	static int ajustement;

	public static void main(String[] args) {

		// Boucle de saisie pour que l'utilisateur choisisse un entier, gères les
		// exceptions

		while (true) {
			try {
				System.out.println("Veuillez choisir un nombre entier :");
				nombreEntier = monScanner.nextInt();
				break;
			} catch (Exception erreur) {
				System.out.println("Erreur, veuillez réessayer.");
				monScanner.nextLine(); // Efface l'entrée de l'utilisateur
			}
		}

		// Boucle de saisie pour que l'utilisateur choisisse une opération (1 :
		// Augmentation, 2 : Diminution), gère les exceptions

		while (true) {
			try {
				System.out.println("Veuillez choisir une opération ? (1 : Augmentation , 2 : Diminution ) :");
				int saisie = monScanner.nextInt();

				if (saisie == 1) {
					ajustement = augmentation();
				} else if (saisie == 2) {
					ajustement = diminution();
				}

				break;
			} catch (Exception erreur) {
				System.out.println("Erreur, veuillez réessayer ! Entrez un nombre entier :");
				monScanner.nextLine(); // Efface l'entrée de l'utilisateur
			}
		}

		// Affiche le résultat

		affichage();
		monScanner.close(); // Ferme le Scanner

	}

	// Fonction pour que l'utilisateur saisisse un entier pour l'augmentation

	public static int augmentation() {
		int augmentation;
		while (true) {
			try {
				System.out.println("Veuillez entrer un nombre entier pour l'augmentation :");
				augmentation = monScanner.nextInt();
				break;
			} catch (Exception erreur) {
				System.out.println("Erreur, veuillez réessayer !");
				monScanner.nextLine(); // Efface l'entrée de l'utilisateur
			}
		}

		// Calcule la nouvelle valeur après l'augmentation

		int nombre = nombreEntier + augmentation;
		return nombre;
	}

	// Fonction pour que l'utilisateur saisisse un entier pour la diminution

	public static int diminution() {
		int diminution;
		while (true) {
			try {
				System.out.println("Veuillez entrer un nombre entier pour la diminution :");
				diminution = monScanner.nextInt();
				break;
			} catch (Exception erreur) {
				System.out.println("Erreur, veuillez réessayer !");
				monScanner.nextLine(); // Efface l'entrée de l'utilisateur
			}
		}

		// Calcule la nouvelle valeur après la diminution

		int nombre = nombreEntier - diminution;
		return nombre;
	}

	// Fonction pour afficher les valeurs originale et modifiée

	public static void affichage() {
		System.out.println("Le nombre saisi par l'utilisateur avant modification : " + nombreEntier
				+ " et après modification est de : " + ajustement);
	}
}
