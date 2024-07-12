package q2563;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] sq = new int[100][100];
		
		int result = 0;
		int tc = sc.nextInt();

		for (int i = 0; i < tc; i++) {
			int leftD = sc.nextInt();
			int bottomD = sc.nextInt();
			for (int j = 99 - bottomD; j > 100 - bottomD - 10 - 1; j--) {
				for (int k = leftD; k < leftD + 10; k++) {
					sq[j][k]++;
				}
			}

		}

		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < 100; j++) {
				if (sq[i][j] > 0) {
					result++;
				}
			}
		}

		System.out.println(result);

	}

}
