package q2530;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int M = sc.nextInt();
		int S = sc.nextInt();

		int T = sc.nextInt();

		while (true) {
			if (T >= 60) {
				T -= 60;
				S += 60;
			} else {
				S += T;
				T -= T;
				
			}

			if (S >= 60) {
				S -= 60;
				M++;
			}

			if (M >= 60) {
				M -= 60;
				H++;
			}

			if (H == 24) {
				H = 0;
			}

			if (T == 0) {
				break;
			}
		}
		
		System.out.println(H + " " + M + " " + S);

	}

}
