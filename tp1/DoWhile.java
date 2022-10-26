package tp1;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		/*
		 11.3 Exercice 3 :
			Réaliser un programme qui demande à l’utilisateur un nombre compris entre 0 et 3 (inclus) jusqu’à ce 
			que la réponse convienne. Dans le cas où la réponse ne convient pas, il faut le signaler à l'utilisateur.

		 */
		Scanner sc = new Scanner(System.in);
		int nombre;
		do {
			System.out.println("Donnez un nombre");
			nombre = sc.nextInt();
			if(nombre < 0 || nombre > 3 )
				System.out.println("Mauvaide valeur");
		}while (nombre < 0 || nombre > 3);
		System.out.println("Ok, fin du programme");
	}
}
