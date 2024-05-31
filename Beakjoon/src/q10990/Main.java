package q10990;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int firstSpace = n - 1;
		int btnSpace = 1;

		for (int i = 0; i < firstSpace; i++) {
			System.out.print(" ");
		}
		System.out.print("*");
		System.out.println("");
		firstSpace--;
		for (int j = 0; j < n - 1; j++) {
			for (int i = 0; i < firstSpace; i++) {
				System.out.print(" ");
			}
			System.out.print("*");
			firstSpace--;

			for (int k = 0; k < btnSpace; k++) {
				System.out.print(" ");

			}
			System.out.print("*");
			System.out.println("");
			btnSpace += 2;

		}

	}

}
