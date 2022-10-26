package tableaux;

import java.util.Scanner;

public class Exercice4 {

	public static void main(String[] args) {
//		Exercice 4 :
//			Réaliser un programme qui :
//			 demande à l’utilisateur de saisir 10 valeurs entières et les range dans un tableau ;
//			 demande à l’utilisateur de saisir 2 entiers Val1 et Val2;
//			 affiche le nombre de valeurs appartenant à l'intervalle [Val1,Val2].
		
		Scanner sc = new Scanner(System.in);
		int [] valeurs = new int [10]; 
		for (int i = 0; i < valeurs.length;i++) {
			System.out.println("Saisissez un nombre");
			int nb = sc.nextInt();
			valeurs[i] = nb;
		};
		System.out.println("Programme terminé voici votre tableau :" );
		for ( int x : valeurs) {
			System.out.println(x);
		};
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Saisissez votre première valeur");
		int val1 = sc2.nextInt();
		
		Scanner sc3 = new Scanner(System.in);
		System.out.println("Saisissez votre deuxième valeur");
		int val2 = sc3.nextInt();
		
		int nbValIntervalles = 0;
		for ( int x : valeurs) {
			System.out.println(x);
		};
		
		

	}

}
