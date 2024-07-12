package q25305;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int persons = sc.nextInt();
		int cut = sc.nextInt();
		int[] arr = new int[persons];
		for (int i = 0; i < persons; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		Arrays.sort(arr);

		System.out.println(arr[persons - cut]);

	}

}
