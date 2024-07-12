package q5575;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {

			int s[] = new int[3];
			int e[] = new int[3];
			int res[] = new int[3];
			for (int j = 0; j < 3; j++) {
				s[j] = sc.nextInt();
			}
			for (int k = 0; k < 3; k++) {
				e[k] = sc.nextInt();
			}

			for (int j = 0; j < 3; j++) {
				res[j] = e[j] - s[j];
			}
			for (int j = 2; j > 0; j--) {
				if (res[j] < 0) {
					res[j] = 60 + res[j];
					res[j - 1]--;
				}
			}
			for (int j = 0; j < 3; j++) {
				System.out.print(res[j] + " ");
			}
			System.out.println();

		}
		sc.close();

	}

}
