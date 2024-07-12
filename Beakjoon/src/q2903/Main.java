package q2903;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();
		int d = 9;
		int result = 0;

		for (int i = 1; i < inp; i++) {
			result = (d * 4) - (d + inp);
			d = result;
		}

		System.out.println(result);

	}

}
