package q2501;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int result = 0;
		int n = sc.nextInt();
		int k = sc.nextInt();
		int i = 1;

		while (true) {

			if (i > n) {
				System.out.println("0");
				break;
			}

			if (n % i == 0) {
				result++;
			}

			if (result == k) {
				System.out.println(i);
				break;
			}

			i++;

		}
		sc.close();
	}

}
