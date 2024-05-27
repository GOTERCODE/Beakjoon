package q2522;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int starOut =0;
		int spaceOut =0;
		
		for(int i=1;i<=n;i++) {
			for(int j=0;j<n-i;j++) {
				System.out.print(" ");
				spaceOut=j;
			}
			for(int k=0;k<i;k++) {
				System.out.print("*");
				starOut=k;
			}
			System.out.println("");
		}
		spaceOut++;
		
		for(int i =0;i<n-1;i++) {
			for(int j=0;j<spaceOut;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<starOut;k++) {
				System.out.print("*");
			}
			spaceOut++;
			starOut--;
			System.out.println("");
		}

	}

}
