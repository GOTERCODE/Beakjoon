package q1149;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] cost = new int[N][3];
		int[][] costSave = new int[N][3];
		int idx = 10;
		int result = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < 3; j++)
				cost[i][j] = sc.nextInt();
		}
		costSave = cost;

		for (int i = 0; i < N; i++) {
			if (cost[i][0] < cost[i][1] && cost[i][0] < cost[i][2]&&i!=idx) {
				result += cost[i][0];
				idx = 0;
			} else if (cost[i][1] < cost[i][0] && cost[i][1] < cost[i][2]&&i!=idx) {
				result += cost[i][0];
				idx = 1;
			} else if (cost[i][2] < cost[i][1] && cost[i][2] < cost[i][0]&&i!=idx) {
				result += cost[i][0];
				idx = 2;
			}

		}
		System.out.println(result);

	}

}

//1번 집의 색은 2번 집의 색과 같지 않아야 한다.
//N번 집의 색은 N-1번 집의 색과 같지 않아야 한다.
//i(2 ≤ i ≤ N-1)번 집의 색은 i-1번, i+1번 집의 색과 같지 않아야 한다.