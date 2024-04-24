package q18870;

import java.util.Arrays;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] ar = new int[N];
		int[] sorted = new int[N];
		
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		sc.close();

		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i] + " ");

		}

		System.arraycopy(ar, 0, sorted, 0, ar.length);
		for (int i = 0; i < ar.length; i++) {
			System.out.println(sorted + " ");

		}
		
	}

}
