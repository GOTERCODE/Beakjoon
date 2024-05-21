package q4504;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while (true) {
			int inp = sc.nextInt();
			if (inp == 0) {
				break;
			} else if ((inp % n) == 0) {
				System.out.println(inp + " is a multiple of " + n + ".");
			} else if ((inp % n) != 0) {
				System.out.println(inp + " is NOT a multiple of " + n + ".");
			}

		}
		sc.close();
	}

}
