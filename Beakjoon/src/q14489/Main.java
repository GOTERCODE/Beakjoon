package q14489;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextInt();
		long b = sc.nextInt();
		long c = sc.nextInt();
		sc.close();
		if (c*2 > a + b) {
			System.out.println(a + b);
		} else {
			System.out.println(a + b - (c*2));
		}

	}

}
