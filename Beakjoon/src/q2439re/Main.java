package q2439re;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.close();

		int spacecnt = T - 1;

		for (int k = 0; k < T; k++) {
			int starcnt = T - spacecnt;
			for (int i = 0; i < spacecnt; i++) {
				System.out.print(" ");

			}
			spacecnt--;
			for (int j = 0; j < starcnt; j++) {
				System.out.print("*");

			}
			System.out.println();
		}

	}

}
