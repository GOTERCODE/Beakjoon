package q3040;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] hat = new int[9];
		for (int i = 0; i < hat.length; i++) {
			hat[i] = sc.nextInt();
		}
		sc.close();

		// print
		for (int i = 0; i < hat.length; i++) {

		}

		// 9개의 수 합을 구하기
		int sum = 0;
		for (int i = 0; i < hat.length; i++) {
			sum += hat[i];
		}


		// 합계에서 제외 할 2개의 수를 선정
		int ai = -1, aj = -1;
		for (int i = 0; i < hat.length; i++) {
			for (int j = 0; j < hat.length; j++) {
				if (i != j) {


					if ((sum - (hat[i] + hat[j]) == 100)) {
						ai = i;
						aj = j;
						break;
					}
				}
			}
		}

		for (int k = 0; k < hat.length; k++) {
			if (k != ai && k != aj)
				System.out.println(hat[k]);
		}
	}
}