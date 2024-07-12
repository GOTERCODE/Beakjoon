package q20115;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		double[] arr = new double[c];
		for (int i = 0; i < c; i++) {
			arr[i] = sc.nextDouble();
		}
		sc.close();
		Arrays.sort(arr);
		double result = arr[c - 1];

		for (int i = c - 2; i >= 0; i--) {
			result += (arr[i]/2);
		}

		System.out.println(result);

	}

}
