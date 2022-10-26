package tp1;

import java.util.Scanner;

public class Exercice6 {

	public static void main(String[] args) {
		/*Un magasin consent une réduction dans les conditions suivantes :
 Si le montant de l'achat est strictement inférieur à 350€, il n'y a pas de réduction
 Si le montant de l'achat est compris entre 350€ et 600€, 3% de réduction est accordé
 Si le montant de l'achat est supérieur ou égal à 600€, 5% de réduction est accordé
Réaliser un programme qui :
- demande la saisie du montant de l'achat;
- calcule le prix net à payer et l'affiche.
*/
		
		System.out.println("Saisissez un montant");
		Scanner sc = new Scanner(System.in);
		int saisie = sc.nextInt();
		if(saisie < 350){
			System.out.println(saisie);
		}else if(saisie >= 350 && saisie < 600){
			int prix = saisie - (saisie *3 / 100); 
			System.out.println(prix );
		}else {
			int prix = saisie - (saisie *5 / 100); 
			System.out.println(prix );
		}
	}
}
