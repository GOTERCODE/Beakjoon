package q2693;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int tc = sc.nextInt();
		int arr[] = new int[10];
		for (int j = 0; j < tc; j++) {

			for (int i = 0; i < 10; i++) {
				arr[i] = sc.nextInt();
			}
			Arrays.sort(arr);

			System.out.println(arr[7]);
		}
		sc.close();
	}

}
