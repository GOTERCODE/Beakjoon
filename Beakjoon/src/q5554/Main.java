package q5554;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sec = 0;
		int min = 0;
		for (int i = 0; i < 4; i++) {
			sec += sc.nextInt();
		}

		while (true) {
			if (sec >= 60) {
				sec -= 60;
				min++;
			}
			if (sec < 60) {
				break;
			}
		}
		System.out.println(min);
		System.out.println(sec);

	}

}
