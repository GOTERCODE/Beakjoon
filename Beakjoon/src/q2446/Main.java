package q2446;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int starOut = n + (n - 1);
		int spaceOut = 0;
		for (int i = 0; i < n; i++) {
			for (int k = 0; k < i; k++) {
				System.out.print(" ");
				spaceOut = k;
			}

			for (int j = 0; j < starOut; j++) {
				System.out.print("*");
			}
			starOut -= 2;
			System.out.println("");
		}
		
		starOut +=4;
		for (int i = 0; i < n - 1; i++) {
			for(int k = 0;k<spaceOut;k++) {
				System.out.print(" ");
			}
			
			spaceOut--;
			
			for (int j = starOut; j > 0; j--) {
				System.out.print("*");
			}
			starOut +=2;
			System.out.println("");

		}
	}
}
