package q10101;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		sc.close();
		if ((n1 + n2 + n3) != 180) {
			System.out.println("Error");
		}

		if ((n1 + n2 + n3) == 180) {
			if (n1 == 60 && n2 == 60 || n3 == 60) {
				System.out.println("Equilateral");
			} else if (n1 == n2 || n2 == n3 || n1 == n3) {
				System.out.println("Isosceles");
			} else if (n1 != n2 || n2 != n3 || n1 != n3) {
				System.out.println("Scalene");
			}
		}
	}
}
