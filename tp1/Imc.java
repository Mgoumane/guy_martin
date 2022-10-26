package tp1;

import java.util.Scanner;

public class Imc {

	public static void main(String[] args) {
		/*Réaliser un programme qui :
- calcule et affiche l'IMC d'une personne 
(le poids et la taille seront saisis par l'utilisateur);
- interprète l'IMC calculé en se servant du tableau ci-dessus*/
		
		System.out.println("Saisissez votre poids");
		Scanner scPoids = new Scanner(System.in);
		double poids = scPoids.nextDouble();
		
		System.out.println("Saisissez votre taille");
		Scanner scTaille = new Scanner(System.in);
		double taille = scTaille.nextDouble();
		
		double imc = poids / (taille * taille);
		
		System.out.println("Votre Imc est de " + imc);
		
		if(imc < 16.5){
			System.out.println("Dénutrition");
		}else if(imc >= 350 && imc < 18.5){
			System.out.println("maigreur");
		}else if (imc >=18.5 && imc < 25 ) {
			System.out.println("Corpulence normale");
		}else if (imc >=25 && imc < 30 ) {
			System.out.println("Surpoids");
		}else {
			System.out.println("Obésité");
		}
	}

}
