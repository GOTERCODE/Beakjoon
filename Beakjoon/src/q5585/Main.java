package q5585;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		int coinCnt = 0;
		int NN = 1000 - N;
		while (true) {
			if (NN >= 500) {
				NN -= 500;
				coinCnt++;
			} else if (NN >= 100) {
				NN -= 100;
				coinCnt++;
			} else if (NN >= 50) {
				NN -= 50;
				coinCnt++;
			} else if (NN >= 10) {
				NN -= 10;
				coinCnt++;
			} else if (NN >= 5) {
				NN -= 5;
				coinCnt++;
			} else if (NN >= 1) {
				NN -= 1;
				coinCnt++;
			}

			if (NN == 0) {
				break;
			}
		}

		System.out.println(coinCnt);

	}

}
