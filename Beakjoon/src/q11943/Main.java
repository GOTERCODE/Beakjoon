package q11943;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int b1[] = new int[2];
		int b2[] = new int[2];

		for (int i = 0; i < 2; i++) {
			b1[i] = sc.nextInt();
		}
		for (int i = 0; i < 2; i++) {
			b2[i] = sc.nextInt();
		}
		sc.close();
		int res1 = b1[0] + b2[1];
		int res2 = b1[1] + b2[0];
		
		if(res1>res2) {
			System.out.println(res2);
		}else {
			System.out.println(res1);
		}

	}

}
