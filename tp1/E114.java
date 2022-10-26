package tp1;

import java.util.Scanner;

public class E114 {

	public static void main(String[] args) {
//		Réaliser un programme qui demande un nombre compris entre 10 et 20 (inclus), jusqu’à ce que la 
//		réponse convienne. En cas de réponse supérieure à 20, il faut faire apparaître un message : « Plus 
//		petit ! », et inversement, « Plus grand ! » si le nombre est inférieur à 10.
		
		Scanner sc = new Scanner(System.in);
		int nombre;
		do {
			System.out.println("Donnez un nombre");
			nombre = sc.nextInt();
			if (nombre < 10)
				System.out.println("Trop petit");
			if (nombre > 20)
				System.out.println("Trop grand");
		} while (nombre < 10 || nombre > 20);
		System.out.println("Nombre correct, fin du programme ");

	}

}
