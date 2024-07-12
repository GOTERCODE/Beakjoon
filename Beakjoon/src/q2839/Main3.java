package q2839;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		sc.close();

		int ss = s;
		int t5 = 0;

		boolean b = true;

		while (true) { // 5kg 봉지를 쓸 최대 횟수 구하기
			if (ss == 0) {
				System.out.println(t5); // 이 과정에서 설탕의 총량이 5의 약수라면 답을 바로 출력한다.
				b = false; // 답은 이미 나왔으므로 다음 로직을 실행하지 않는다.
				break;
			} else if (ss < 5) {

				break;
			}

			ss -= 5;
			t5++;

		}

		int cnt = 0;
		ss = s;

		while (b) { // 5키로 봉지를 최대한 쓰고 답이 나오지 않으면 5키로봉투를 쓰는 횟수를 1개씩 줄여나가면서 다시계산

			if (ss >= 5) {
				for (int i = 0; i < t5; i++) {
					ss -= 5;
					cnt++;
				}
			}

			while (true) {
				if (ss >= 3) {

					ss -= 3;
					cnt++;
				} else if (ss == 0) {
					System.out.println(cnt);
					b = false;
					break;
				} else if (ss < 3) {
					ss = s;
					cnt = 0;
					t5--;
					break;
				}

				if (t5 < 0) {
					break;
				}

			}
			if (t5 < 0 && ss % 3 != 0) {
				System.out.println("-1");
				break;
			}
		}

	}

}
