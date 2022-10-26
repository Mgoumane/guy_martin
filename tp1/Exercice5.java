package tp1;

import java.util.Scanner;

public class Exercice5 {

	public static void main(String[] args) {
		 //réaliser un programme qui :
		// demande la saisie de l'heure (sans les minutes);
		// affiche "Bonjour" si l'heure est inférieure ou égale à 16 et 
		//"Bonsoir" dans le cas contraire.
		
		System.out.println("Saisissez l'heure sans les minutes");
		Scanner sc = new Scanner(System.in);
		int heureSaisie = sc.nextInt();
		if(heureSaisie <= 16 ) {
			System.out.println("Bonjour");
		}else {
			System.out.println("Bonsoir");
		}
	}
}
