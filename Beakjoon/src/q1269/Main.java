package q1269;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[sc.nextInt()];
		int b[] = new int[sc.nextInt()];
		int cnt = 0;
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < b.length; i++) {
			b[i] = sc.nextInt();
		}
		sc.close();
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					cnt++;
				}
			}
		}

		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (b[i] == a[j]) {
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}

}
