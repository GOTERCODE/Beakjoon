package q2167;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		int arr[][] = new int[n][m];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		int tc = sc.nextInt();

		for (int k = 0; k < tc; k++) {
			int i = sc.nextInt();
			int j = sc.nextInt();
			
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			int result = 0;

			
				for (int w = j; w < y; w++) {
					for (int q = i; q < x; q++) {
					result += arr[w - 1][q - 1];
				}
			}
			System.out.println(result);

		}
	}

}
