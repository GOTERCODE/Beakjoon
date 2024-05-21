package q5988;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int tc = sc.nextInt();

		for (int i = 0; i < tc; i++) {
			long inp = sc.nextLong();
			
			if ((inp % 2) == 0) {
				System.out.println("even");
			} else {
				System.out.println("odd");
			}
		}
		sc.close();
	}

}
