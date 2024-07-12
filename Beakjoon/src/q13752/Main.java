package q13752;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();

		for (int i = 0; i < tc; i++) {
			int n = sc.nextInt();
			for (int j = 0; j < n; j++) {
				System.out.print("=");
			}
			System.out.println();
		}
		sc.close();
	}

}
