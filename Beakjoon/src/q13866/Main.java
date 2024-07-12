package q13866;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n[] = new int[4];
		for (int i = 0; i < 4; i++) {
			n[i] = sc.nextInt();
		}
		sc.close();
		Arrays.sort(n);
		int t1 = n[0] + n[3];
		int t2 = n[1] + n[2];

		if (t1 > t2) {
			System.out.println(t1 - t2);
		} else {
			System.out.println(t2 - t1);
		}

	}

}
