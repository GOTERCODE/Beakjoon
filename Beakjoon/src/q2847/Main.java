package q2847;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		int arr[] = new int[tc];

		int count = 0;

		for (int i = 0; i < tc; i++) {
			arr[i] = sc.nextInt();
		}

		sc.close();
		
		for (int i = tc - 2; i >= 0; i--) {
			boolean B = true;
			while (B)
				if (arr[i] >= arr[i + 1]) {
					arr[i]--;
					count++;

				} else {
					B = false;
				}
		}

		System.out.println(count);

	}

}
