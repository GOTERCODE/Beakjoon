package q11399;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		int[] arr = new int[c];
		int result = 0;
		int sum = 0;
		for (int i = 0; i < c; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		Arrays.sort(arr);

		for (int i = 0; i < c; i++) {
			sum += arr[i];
			result += sum;
		}
		System.out.println(result);

	}

}
