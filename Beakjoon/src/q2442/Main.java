package q2442;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int l = 1;
		for (int i = 0; i < n; i++) {

			int spaceOut = n - i - 1;
			for (int j = 0; j < spaceOut; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < i + l; k++) {
				System.out.print("*");

			}
			l++;
			System.out.println("");
		}

	}
}