package q2669;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int[][] arr = new int[100][100];
		Scanner sc = new Scanner(System.in);
		int cnt = 0;

		for (int i = 0; i < 4; i++) {
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();

			for (int j = x1; j < x2; j++) {
				for (int k = y1; k < y2; k++) {
					arr[j][k]++;
				}
			}

		}
		
		sc.close();
		
		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < 100; j++) {
				if (arr[i][j] >= 1) {
					cnt++;
				}
			}
		}

		System.out.println(cnt);

	}

}
