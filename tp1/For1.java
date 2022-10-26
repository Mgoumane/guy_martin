package tp1;

import java.util.Scanner;

public class For1 {

	public static void main(String[] args) {
		System.out.println("Combien de fois dites vous bonjour ?");
		Scanner sc = new Scanner(System.in);
		int nb = sc.nextInt();
		for (int i = 0; i<nb; i++) {
			System.out.println("bonjour");
		}
		

	}

}
