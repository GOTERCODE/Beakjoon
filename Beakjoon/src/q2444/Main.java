package q2444;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int l = 1;
		int ll = n - 1;
		for (int i = 0; i < n; i++) {

			int spaceOut = n - i - 1;
			for (int j = 0; j < spaceOut; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < i + l; k++) {
				System.out.print("*");

			}
			l++;
			System.out.println("");
		}
		
		for (int i = 0; i < n-1; i++) {		//내림차순 출력 조건
			int starOut = n+ll-2;				//별 출력 횟수
			for (int j = 0; j < i+1; j++) {	//공백 출력
				System.out.print(" ");
			}
			for (int k = starOut; k >= 1; k--) {	//별 출력
				System.out.print("*");
			}
			ll--;
			ll--;
			System.out.println("");
			
		}

	}

}
