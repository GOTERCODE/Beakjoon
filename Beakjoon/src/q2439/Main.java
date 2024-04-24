package q2439;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.close();
		int i = 0;
		int k = 0;
		for (i = 0; i < T; i++) {

			System.out.print(" ");
		}

		for (k = 0; k < T; k++) {
			for (int j = 0; j < k + 1; j++) {
				System.out.print("*");
			}
			System.out.println("");
			
		}
		

	}

}
