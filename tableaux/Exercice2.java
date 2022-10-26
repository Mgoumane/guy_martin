package tableaux;

import java.util.Scanner;

public class Exercice2 {

	public static void main(String[] args) {
//		Exercice 2 :
//			Réaliser un programme qui :
//			 demande à l’utilisateur de saisir 8 valeurs entières et les range dans un tableau ;
//			 demande à l’utilisateur de saisir un (autre) entier nommé val;
//			 affiche le nombre de fois où val est présent dans le tableau.

		Scanner sc = new Scanner(System.in);
		int [] valeurs = new int [8]; 
		for (int i = 0; i < valeurs.length;i++) {
			System.out.println("Saisissez un nombre");
			int nb = sc.nextInt();
			valeurs[i] = nb;
		};
		System.out.println("Programme terminé voici votre tableau :" );
		for ( int x : valeurs) {
			System.out.println(x);
		};
		
		System.out.println("Saisissez un nombre");
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Saisissez un autre entier");
		int val = sc2.nextInt();
		int nbPresence = 0;
		for ( int x : valeurs) {
			System.out.println(x);
			if(x == val) {
				nbPresence++;
			};
		};
		System.out.println("Val est present " + nbPresence + " fois");
		
	}

}
