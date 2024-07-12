package q2845;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt() * sc.nextInt();

		for (int i = 0; i < 5; i++) {
			int inp = sc.nextInt();
			
			System.out.print(inp-n + " ");
		}

	}

}
