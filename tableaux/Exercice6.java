package tableaux;

import java.util.Scanner;

public class Exercice6 {

	public static void main(String[] args) {
//		Exercice 6 :
//			Réaliser un programme qui :
//			 demande à l’utilisateur de saisir 10 valeurs entières et les range dans le tableau ;
			Scanner sc = new Scanner(System.in);
			int [] valeurs = new int [10]; 
			for (int i = 0; i < valeurs.length;i++) {
				System.out.println("Saisissez un nombre");
				int nb = sc.nextInt();
				valeurs[i] = nb;
			};
//			 affiche le contenu du tableau ;
			System.out.println("Programme terminé voici votre tableau :" );
			for ( int x : valeurs) {
				System.out.println(x);
			};

//			 « arrange » le tableau afin de placer les valeurs négatives avant les valeurs positives ou nulles ;
			
//			 affiche le nouveau contenu du tableau.

	}

}
