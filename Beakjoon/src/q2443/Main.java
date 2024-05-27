package q2443;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int l = n - 1;
		
		for (int i = 0; i < n; i++) {
			int starOut = n+l;
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int k = starOut; k >= 1; k--) {
				System.out.print("*");
			}
			l--;
			l--;
			System.out.println("");
			
		}

	}

}
