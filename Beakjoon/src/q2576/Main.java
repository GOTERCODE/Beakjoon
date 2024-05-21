package q2576;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int result = 0;
		int[] arr = new int[7];
		for (int i = 0; i < 7; i++) {

			int n = sc.nextInt();

			if (n % 2 == 1) {
				result += n;
				arr[i] = n;
			}
		}
		Arrays.sort(arr);

		if (result == 0) {
			System.out.println("-1");
		} else {
			System.out.println(result);
			for (int i = 0; i < 7; i++) {
				if (arr[i] != 0) {
					System.out.println(arr[i]);
					break;
				}
			}
		}
		sc.close();
	}

}
