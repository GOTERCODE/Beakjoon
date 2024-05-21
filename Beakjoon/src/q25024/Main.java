package q25024;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();

		
		
		for (int i = 0; i < tc; i++) {
			
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			if (x < 24 && y < 60) {
				System.out.print("Yes ");
			} else {
				System.out.print("No ");
			}
			
			
			if (x <= 12 && y != 0 && x != 0) {

				if (x == 2) {
					if (y <= 29 && y > 0) {
						System.out.println("Yes");
					} else {
						System.out.println("No");
					}
				}
				
				
				if (x == 1 || x == 3 || x == 5 || x == 7 || x == 8 || x == 10 || x == 12) {
					if (y <= 31 && y > 0) {
						System.out.println("Yes");
					} else {
						System.out.println("No");
					}
				}
				
				
				if (x == 4 || x == 6 || x == 9 || x == 11) {
					if (y <= 30 && y > 0) {
						System.out.println("Yes");
					} else {
						System.out.println("No");
					}
				}

			} else if (x > 12 || y == 0 || x == 0) {
				System.out.println("No");
			}

		}
		sc.close();
	}
}
