package q4470;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < tc; i++) {
			String st = sc.nextLine();
			System.out.println((i + 1) + ". " + st);
		}
		sc.close();

	}

}
