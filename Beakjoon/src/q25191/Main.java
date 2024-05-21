package q25191;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int chCnt = sc.nextInt();
		sc.nextLine();

		int c = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		int cnt = 0;
		boolean B = true;
		while (B) {
			for (int i = c; i > 0; i -= 2) {

				if (chCnt == 0) {
					break;
				}

				if (i == 1) {
					break;
				}
				chCnt--;
				cnt++;

			}
			for (int i = b; i > 0; i--) {

				if (chCnt == 0) {
					break;

				}
				chCnt--;
				cnt++;

			}

			B = false;

		}

		System.out.println(cnt);

	}

}
