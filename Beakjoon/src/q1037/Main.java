package q1037;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int[] arr = new int[t];

		for (int i = 0; i < t; i++) {
			arr[i] = sc.nextInt();
		}

		sc.close();

		Arrays.sort(arr);
		boolean b2 = true;
		boolean b = false;
		int i = 2;
		int j = t - 2;

		if (t == 1) {
			System.out.println(arr[0] * 2);
			b2 = false;
		}

		while (b2) {

			for (int k = j; k >= 0; k--) {
				if ((arr[t - 1] * i) % arr[k] == 0) {
					b = true;
				} else {
					b = false;
				}

			}
			if (b == true) {
				System.out.println(arr[t - 1] * i);
				b2 = false;
				break;
			}

			i++;
		}

	}

}
