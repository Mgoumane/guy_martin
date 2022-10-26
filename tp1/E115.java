package tp1;

import java.util.Scanner;

public class E115 {

	private static Scanner sc;

	public static void main(String[] args) {
//		11.5 Exercice 5 :
//			Réaliser un programme qui demande un nombre de départ, et qui ensuite affiche les dix nombres 
//			suivants. Par exemple, si l'utilisateur entre le nombre 17, le programme doit afficher les nombres de 18 
//			à 27.
		
		
		sc = new Scanner(System.in);
		int nombre;
		System.out.println("Donnez un nombre");
		nombre = sc.nextInt();
		for(int x =1; x <= 10; x++) {
			int s = nombre+x; 
			System.out.println(s);
		}
	}

}
