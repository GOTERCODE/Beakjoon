package q2750;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		int[] inp = new int[tc];
		for (int i = 0; i < tc; i++) {
			inp[i] = sc.nextInt();
		}
		sc.close();
		Arrays.sort(inp);

		for (int i = 0; i < tc; i++) {
			System.out.println(inp[i]);
		}
	}
}