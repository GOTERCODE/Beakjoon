package q2577;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		sc.close();

		String result = A * B * C + "";
		char[] ch = result.toCharArray();
		int[] numb = new int[10];
		int[] cnt = new int[10];
		for (int i = 0; i < 10; i++) {
			numb[i] = i;
		}

		for (int i = 0; i < result.length(); i++) {
			for (int k = 0; k < 10; k++) {
				if (ch[i] - 48 == numb[k]) {
					cnt[k]++;
				}
			}
		}

		for (int i = 0; i < 10; i++) {
			System.out.println(cnt[i]);
		}

	}

}
