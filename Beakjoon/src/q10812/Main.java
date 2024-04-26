package q10812;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int bucketT = sc.nextInt();
		int cnt = sc.nextInt();
		int bucketA[] = new int[bucketT];

		for (int i = 0; i < bucketT; i++) {
			bucketA[i] = i + 1;
		}
		int save = 0;
		for (int i = 0; i < cnt; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			for (int j = 0; j < (B - A + 1) / 2; j++) {
                save = bucketA[A + j - 1];
                bucketA[A + j - 1] = bucketA[B - j - 1];
                bucketA[B - j - 1] = save;
            }
		}
		sc.close();
		for (int i = 0; i < bucketT; i++) {
			System.out.println(bucketA[i]);
		}
	}

}
