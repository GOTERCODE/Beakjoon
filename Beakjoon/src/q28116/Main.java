package q28116;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nArr = new int[n];
		int[] moveCnt = new int[n];
		int save = 0;
		for (int i = 0; i < n; i++) {
			nArr[i] = sc.nextInt();
		}

		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				if (nArr[j] == i + 1) {
					save = nArr[i];
					nArr[i] = nArr[j];
					nArr[j] = save;
					moveCnt[i] += j - i;
					moveCnt[j] += j - i;
				}
			}

		}
		for (int i = 0; i < n; i++) {
			System.out.print(moveCnt[i] + " ");
		}

	}

}
