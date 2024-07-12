package q1138;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		Integer[] arr2 = new Integer[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		for (int i = 0; i < n; i++) {
			arr2[i] = arr[i];
		}

		
		Arrays.sort(arr2);

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (arr[i] == arr2[j]) {
					System.out.print((j + 1) + " ");
					arr2[j] = 100;

				}
			}
		}

	}

}
