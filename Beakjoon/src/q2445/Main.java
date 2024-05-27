package q2445;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int spaceOut = n + (n - 2);
		for (int i = 0; i < n; i++) {

			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			for (int k = 0; k < spaceOut; k++) {
				System.out.print(" ");
			}

			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}

			spaceOut--;
			spaceOut--;
			System.out.println("");

		}
		spaceOut++;
		spaceOut++;
		spaceOut++;
		spaceOut++;

		for (int i = n - 1; i > 0; i--) {
			for (int j = 0; j < i ; j++) {
				System.out.print("*");
			}
			for (int k = 0; k < spaceOut; k++) {
				System.out.print(" ");
			}

			for (int j = 0; j < i ; j++) {
				System.out.print("*");
			}

			spaceOut++;
			spaceOut++;
			System.out.println("");
		}
	}

}
