package q2525;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int M = sc.nextInt();
		int setTime = sc.nextInt();
		sc.close();
//		int resultM = M + setTime;

		for (int i = 0; i < setTime; i++) {
			M++;
			if (M == 60) {
				H++;
				M = 0;
				if (H == 24) {
					H = 0;

				}
			}
		}
		System.out.println(H + " " + M);
	}

}
