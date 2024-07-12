package q2609re;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[2];
		arr[0] = sc.nextInt();
		arr[1] = sc.nextInt();
		sc.close();
		Arrays.sort(arr); // 큰수와 작은수 나누기

		int min = 1;
		boolean B = true;

		for (int i = arr[1]; i >= 1; i--) { // 최대공약수

			if (arr[1] % i == 0 && arr[0] % i == 0) {
				System.out.println(i);
				break;
			}
		}

		while (B) { // 최대공배수
			int A = arr[1] * min;
			for (int i = 1; i < 10000; i++) {
				if (A == arr[0] * i) {
					System.out.println(A);
					B = false;
					break;
				}
			}
			min++;
		}

	}

}
