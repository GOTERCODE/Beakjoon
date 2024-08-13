package q1934;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			if (a > b) {
				for (int j = 1; j <= a; j++) {
					if ((b * j) % a == 0) {
						System.out.println(j*b);
						break;
					}
				}
			} else if (b > a) {
				for (int j = 1; j <= b; j++) {
					if ((a * j) % b == 0) {
						System.out.println(j*a);
						break;
					}
				}

			} else if (a == b) {
				System.out.println(a);
			}
		}
		sc.close();

	}

}
