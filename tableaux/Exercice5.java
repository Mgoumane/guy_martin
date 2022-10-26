package tableaux;

import java.util.Scanner;

public class Exercice5 {

	public static void main(String[] args) {			 
//			Réaliser un programme qui : demande à l’utilisateur la saisie d’une date (le jour et le mois uniquement) ;
			Scanner sc = new Scanner(System.in);
			int nb =0;
			int [] tableauxDesMois = {31,28,31,30,31,30,31,31,30,31,30,31};
			int mois ;
			int jour ;
			
			do {
				System.out.println("Saisissez un mois");
				 mois = sc.nextInt();
			}while(mois <=0 || mois >12);
			System.out.println("Vous avez saisie " + mois);
			
			
			do {
				System.out.println("Saisissez un jour");
				jour = sc.nextInt();
			}while(jour <=0 || jour >tableauxDesMois[mois-1]);
			System.out.println("Vous avez saisie " + tableauxDesMois[mois-1]);	
			
//			 calcule le nombre de jours écoulés depuis le début de l’année jusqu’à la date saisie.
//			On supposera que l’année en cours est l’année 2015.		
			
			int i = 0;
			while(i < mois-1) {
				nb = nb + tableauxDesMois[i];
				i++;
			};
			nb = nb +jour;
			System.out.println("Nombre de jours demandé : " + nb);
			

//			Le programme doit vérifier la validité de la date saisie.
//			Exemples de dates non valides au format JJ/MM : 32/01 ; 20/13 ; 29/02 ; 31/11 ; … 
//			Pour cela il faut utiliser un tableau comprenant le nombre de jours par mois de chaque mois de l'année 
//			2015.
		
		
		
	}

}
