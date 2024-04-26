package q10807;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int n[] = new int[t];
		int count = 0;
		for (int i = 0; i < t; i++) {
			n[i] = sc.nextInt();
		}
		int f = sc.nextInt();
		sc.close();
		for (int i = 0; i < t; i++) {

			if (n[i] == f) {
				count++;
			}

		}
		System.out.println(count);
	}

}
