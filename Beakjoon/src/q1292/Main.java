package q1292;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		int sum = 0;

		for (int i = a + 1; i < b; i++) {
			sum += i;
		}
		System.out.println(sum);
	}

}
