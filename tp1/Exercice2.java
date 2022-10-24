package tp1;

import java.util.Scanner;

public class Exercice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Tapez le prix de l'objet");
		int objet = sc.nextInt();;
		double prixTva = objet * 20 / 100 ;
		double prixHt = objet - prixTva;
		System.out.println(prixTva);
		System.out.println(prixHt);
		
		System.out.println("Tapez le nombre d'objets");
		int nbObjets = sc.nextInt();
		int prixTotalTtc = objet * nbObjets;
		double totalHt = prixHt *  nbObjets;
		double tvaTotal = prixTva *  nbObjets;
		System.out.println(prixTotalTtc);
		System.out.println(totalHt);
		System.out.println(tvaTotal);

	}

}
