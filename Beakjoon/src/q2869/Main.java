package q2869;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int V = sc.nextInt();
		sc.close();
		int I = A;
		int day = 0;
		while (true) {
			if (I < V) {
				if (I < V) {
					I = I + (A - B);
					day++;
				}

			} else if (I >= V) {
				System.out.println(day + 1);
				break;
			}
		}

	}

}
