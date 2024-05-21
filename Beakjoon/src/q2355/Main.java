package q2355;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		int result = 0;
		for (int i = a; i <= b; i++) {
			result = result + i;
		}
		System.out.println(result);
	}

}
