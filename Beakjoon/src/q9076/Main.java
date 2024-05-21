package q9076;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		Integer[] score = new Integer[5];
		for (int i = 0; i < testcase; i++) {
			for (int j = 0; j < 5; j++) {
				score[j] = sc.nextInt();
			}
			Arrays.sort(score);
			if ((score[3] - score[1]) >= 4) {
				System.out.println("KIN");
			} else {
				System.out.println(score[1] + score[2] + score[3]);
			}
		}
		sc.close();
	}

}
