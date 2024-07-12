package q7570;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		int[] arr = new int[c];
		int cnt = 0;
		for (int i = 0; i < c; i++) {
			arr[i] = sc.nextInt();
		}

		sc.close();

		while (true) {

			for (int i = 0; i < c; i++) {
				if (arr[i] - 1 == arr[c - 1]) {
					int save = arr[c - 1];
					arr[c - 1] = arr[i];
					arr[i] = save;
					cnt++;
				}
			}
		}
	}

}
