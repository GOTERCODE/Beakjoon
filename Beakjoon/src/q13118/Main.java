package q13118;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int p[] = new int[4];
		for (int i = 0; i < 4; i++) {
			p[i] = sc.nextInt();
		}
		int x = sc.nextInt();
		int y = sc.nextInt();
		int r = sc.nextInt();
		sc.close();
		for (int i = 0; i < 4; i++) {
			if (p[i] == x) {
				System.out.println(i + 1);
				break;
			}

		}

		if (p[0] != x && p[1] != x && p[2] != x && p[3] != x) {
			System.out.println("0");
		}
	}

}
