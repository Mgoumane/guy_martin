package tableaux;

import java.util.Scanner;

public class Exercice3 {

	public static void main(String[] args) {
//		Exercice 3 :
//			Réaliser un programme qui :
//			 demande à l’utilisateur de saisir 8 valeurs entières et les range dans un tableau ;
//			 détermine et affiche les valeurs minimale et maximale.
		Scanner sc = new Scanner(System.in);
		int [] valeurs = new int [8]; 
		for (int i = 0; i < valeurs.length;i++) {
			System.out.println("Saisissez un nombre");
			int nb = sc.nextInt();
			valeurs[i] = nb;
		};
		
		int valMin = Integer.MAX_VALUE;
		int valMax= Integer.MIN_VALUE;
		for ( int x : valeurs) {
			if ( x < valMin) {
				valMin = x;
			};
			if ( x > valMax) {
				valMax = x;
			};
		};
		System.out.println("La veleur minimum est  :" + valMin);
		System.out.println("La veleur maximum est  :" + valMax);

	}

}
