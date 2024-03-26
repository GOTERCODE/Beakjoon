package q3040;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int[] num = new int[9];

		for (int i = 0; i < num.length; i++) {
			num[i] = inp.nextInt();
		}
		inp.close();

		for (int i = 0; i < num.length; i++) {

		}
		// 9개 수 합 구하기
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			sum += num[i];
		}


		int ai = -1, aj = -1;
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num.length; j++) {


				if ((sum - (num[i] + num[j]) == 100)) {
					ai = i;
					ai = j;
					break;
				}
			}
		}

		for (int k = 0; k < num.length; k++) {
			if (k != ai && k != aj)
				System.out.println(num[k]);
		}
	}
}