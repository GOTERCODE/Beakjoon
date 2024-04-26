package q10813;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int bucketT = sc.nextInt();
		int cnt = sc.nextInt();
		int bucket[] = new int[bucketT];

		for (int i = 0; i < bucketT; i++) {
			bucket[i] = i + 1;
		}

		for (int i = 0; i < cnt; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			int save = 0;
			save = bucket[A-1];
			bucket[A-1] = bucket[B-1];
			bucket[B-1] = save;
		}
		sc.close();
		for (int i = 0; i<bucketT;i++) {
			System.out.print(bucket[i]+" ");
		}

	}

}
