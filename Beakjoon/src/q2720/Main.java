package q2720;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();

		for (int i = 0; i < tc; i++) {
			int quater = 0; // 25
			int dime = 0; // 10
			int nickel = 0; // 5
			int penny = 0; // 1
			int C = sc.nextInt();
			while (true) {
				if (C >= 25) {
					C -= 25;
					quater++;
				} else if (C >= 10) {
					C -= 10;
					dime++;
				} else if (C >= 5) {
					C -= 5;
					nickel++;
				} else if (C >= 1) {
					C -= 1;
					penny++;
				} else if (C == 0) {
					break;
				}
			}
			System.out.println(quater + " " + dime + " " + nickel + " " + penny);

		}
		sc.close();

	}

}
