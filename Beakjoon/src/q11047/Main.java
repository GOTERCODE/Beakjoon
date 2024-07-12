package q11047;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] c = new int[n];
		int cnt = 0;
		for (int i = 0; i < n; i++) {
			c[i] = sc.nextInt();
		}
		
		sc.close();

		int idx = n - 1;
		while (true) {

			if (k == 0) {
				System.out.println(cnt);
				break;
			}

			if (k >= c[idx]) {
				k -= c[idx];
				cnt++;
			} else {
				idx--;
			}
		}

	}

}
