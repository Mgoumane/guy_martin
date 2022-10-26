package tp1;

import java.util.Scanner;

public class Condition1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(n);
		if(n <= 5) {
			System.out.println("ok");
		} else {
			System.out.println("erreur");
		}

	}

}
