package q3036;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		int first = sc.nextInt();

		for (int i = 0; i < tc - 1; i++) {
			int inp = sc.nextInt();

			for (int j = inp; j > 0; j--) {
				if (first % j == 0 && inp % j == 0) {
					System.out.println(first / j + "/" + inp / j);
					break;
				}
			}
		}

	}

}
