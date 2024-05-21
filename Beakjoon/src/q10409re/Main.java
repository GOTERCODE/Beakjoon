package q10409re;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		int time = sc.nextInt();
		int worktime = 0;
		int cnt = 0;
		for (int i = 0; i < testcase; i++) {
			int work = sc.nextInt();
			worktime += work;

			if (time < worktime) {
				break;
			}
			cnt++;

		}

		System.out.println(cnt);

		sc.close();
	}

}
