package q1531;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int cnt = 0;
		int[][] arr = new int[100][100];

		for (int i = 0; i < n; i++) {
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();

			for (int j = x1-1; j <= x2-1; j++) {
				for (int k = y1-1; k <= y2-1; k++) {
					arr[j][k]++;
				}
			}
			
			
		}
		for(int i =0;i<100;i++) {
			for(int j=0;j<100;j++) {
				if(arr[i][j]>m) {
					cnt++;
				}
			}
		}
		
		System.out.println(cnt);

	}

}
