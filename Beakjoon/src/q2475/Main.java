package q2475;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] n = new int[5];
		int[] nn = new int[5];
		int result = 0;
		for (int i = 0; i < 5; i++) {
			n[i] = sc.nextInt();
			nn[i] = n[i]*n[i];
			result += nn[i];
		}
		sc.close();
		System.out.println(result%10);
	}

}
