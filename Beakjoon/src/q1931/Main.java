package q1931;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		int c2 = c;
		int arr[] = new int[c];
		int cnt = 0;
		for (int i = 0; i < c; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			arr[i] = b - a;
		}
		
		sc.close();
		Arrays.sort(arr);

		for (int i = 0; i < c; i++) {
			c2 -= arr[i];
			cnt++;

			if (c2 == 0) {
				System.out.println(cnt);
				break;
			} else if (c2 < 0) {
				System.out.println(cnt - 1);
				break;
			}

		}

	}

}
