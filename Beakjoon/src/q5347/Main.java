package q5347;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Long tc = sc.nextLong();
		Long[] arr = new Long[2];
		for (int i = 0; i < tc; i++) {
			arr[0] = sc.nextLong();
			arr[1] = sc.nextLong();
			Arrays.sort(arr);
			int j = 1;
			while (true) {
				if ((arr[0] * j) % arr[1] == 0) {
					System.out.println(arr[0] * j);
					break;
				} else {
					j++;
				}
			}

		}
		sc.close();

	}

}
