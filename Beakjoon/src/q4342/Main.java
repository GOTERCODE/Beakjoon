package q4342;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		while (true) {
			int turn = 0;
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());

			if (a == 0 && b == 0) {
				break;
			}
			boolean bool = true;
			while (bool) {
				if (a > b) {
					for (int i = b; i > 0; i--) {
						if (a >= b * i) {
							a -= b * i;
							turn += i;
						}
						if (a == b) {
							System.out.println("B wins");
							bool = false;
							break;
						}
					}

				} else if (b > a) {
					for (int i = a; i > 0; i--) {
						if (b >= a * i) {
							b -= a * i;
							turn += i;
						}
						if (b == a) {
							System.out.println("A wins");
							bool = false;
							break;
						}
					}

				}

				if (b == 0 || a == 0) {
					if (turn % 2 == 0) {
						System.out.println("A wins");
						break;
					} else {
						System.out.println("B wins");
						break;
					}

				}
			}

		}
		br.close();
	}

}
