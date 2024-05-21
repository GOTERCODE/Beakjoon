package q9501;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();

		for (int i = 0; i < testcase; i++) {
			int n = sc.nextInt();
			int distance = sc.nextInt();
			int cnt = 0;
			for (int j = 0; j < n; j++) {
				double maxsp = sc.nextInt();
				double fuel = sc.nextInt();
				double cf = sc.nextInt();
				if ((maxsp * (fuel / cf)) >= distance) {
					cnt++;
				}
			}

			System.out.println(cnt);

		}
		sc.close();
	}

}
