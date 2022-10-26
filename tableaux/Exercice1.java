package tableaux;

public class Exercice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Exercice 1 :
//			Réaliser un programme qui :
//			 déclare un tableau (pas un String) de 10 caractères en l'initialisant lors de sa déclaration avec 
//			les 10 premières lettres de l'alphabet;
//			 affiche les 10 caractères contenus dans le tableau.
//			Rappel : Les constantes de type caractère doivent être notées entre quotes (ou apostrophes). 
//			7/9 
//			Exemple : 'r' 
		
		char alphabet[] = { 'a','b','c','d','e','f','g','h','i','j' }; 
		
		for ( char x : alphabet) {
			System.out.print(x);
		};
	
		
	}

}
