package q10991;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int firstSpace = n-1;
		for (int i = 0; i < n; i++) {
			for(int j=0;j<firstSpace;j++) {
				System.out.print(" ");
				
			}
			firstSpace--;
			for(int k=0; k<i+1;k++) {
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println("");
		}

	}

}
