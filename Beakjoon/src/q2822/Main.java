package q2822;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] score = new int[8];
		int[] bestScore = new int[5];

		for (int i = 0; i < 8; i++) {

			score[i] = sc.nextInt();

		}

		sc.close();
		Integer[] scoreA = new Integer[8];
		for (int i = 0; i < 8; i++) {
			scoreA[i] = score[i];
		}

		Arrays.sort(scoreA, Collections.reverseOrder());

		System.out.println(scoreA[0] + scoreA[1] + scoreA[2] + scoreA[3] + scoreA[4]);

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 8; j++)
				if (score[j] == scoreA[i]) {

					bestScore[i] = j + 1;
				}
		}
		Arrays.sort(bestScore);
		for (int i = 0; i < 5; i++) {
			System.out.print(bestScore[i] + " ");
		}
	}

}
