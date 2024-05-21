package q2953;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] score = new int[4];
		int[] arr = new int[5];
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4; j++) {
				score[j] = sc.nextInt();
			}
			for (int j = 0; j < 4; j++) {
				arr[i] += score[j];
			}
		}
		sc.close();
		if (arr[0] > arr[1] && arr[0] > arr[2] && arr[0] > arr[3] && arr[0] > arr[4]) {
			System.out.println("1 " + arr[0]);
		} else if (arr[1] > arr[0] && arr[1] > arr[2] && arr[1] > arr[3] && arr[1] > arr[4]) {
			System.out.println("2 " + arr[1]);
		} else if (arr[2] > arr[1] && arr[2] > arr[0] && arr[2] > arr[3] && arr[2] > arr[4]) {
			System.out.println("3 " + arr[2]);
		} else if (arr[3] > arr[1] && arr[3] > arr[2] && arr[3] > arr[0] && arr[3] > arr[4]) {
			System.out.println("4 " + arr[3]);
		} else {
			System.out.println("5 " + arr[4]);
		}

	}

}
