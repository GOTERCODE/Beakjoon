package q4344;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double tc = sc.nextDouble();

		for (int i = 0; i < tc; i++) {
			int n = sc.nextInt();
			double arr[] = new double[n];
			double sum = 0;
			for (int j = 0; j < n; j++) {
				arr[j] = sc.nextInt();
				sum += arr[j];
			}
			int cnt = 0;
			double avg = sum / n;
			for (int j = 0; j < n; j++) {
				if (arr[j] > avg) {
					cnt++;
				}

			}
			double nn = n;
			double result = ((cnt / nn)*100);
			System.out.printf("%.3f",result);
			System.out.print("%");
			System.out.println();
		}
		sc.close();
	}

}
