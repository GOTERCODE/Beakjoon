package q2609;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		sc.close();
		int D = 0;
		if (A > B) {
			int C = B;
			for (int i = B; i > 1; i--) {
				if (B % i == 0 && A % i == 0) {
					System.out.println(i);
					break;
				}
			}
			while (true) {

				if (C % A == 0) {
					System.out.println(C);
					break;
				}
				D++;
				C = B * D;
			}
		}

		if (B > A) {
			int C = A;
			for (int i = A; i > 1; i--) {
				if (A % i == 0 && B % i == 0) {
					System.out.println(i);
					break;
				}
			}
			while (true) {

				if (C % B == 0) {
					System.out.println(C);
					break;
				}
				D++;
				C = A * D;
			}
		}

	}

}
