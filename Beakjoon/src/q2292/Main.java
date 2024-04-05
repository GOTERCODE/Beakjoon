package q2292;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();
		sc.close();
		int six = 6;
		int sixmult = 1;
		

		for (int i = 0; i < 100; i++) {
			int a=1;
			
			if (inp < a) {
				sixmult++;
			}
			a = (six * sixmult) + 1;
		}

		System.out.println(sixmult + 1);
	}
}
