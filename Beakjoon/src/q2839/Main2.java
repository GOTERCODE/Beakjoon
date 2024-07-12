package q2839;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		int cnt = 0;

		while (true) {

			if (N % 5 == 0) {
				N -= 5;
				cnt++;
			} else if (N % 3 == 0) {
				N -= 3;
				cnt++;
			}

			if (N == 0) {
				break;
			}

		}

		System.out.println(cnt);
	}

}
