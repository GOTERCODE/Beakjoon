package q1316;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		int cnt = 0;
		for (int i = 0; i < tc; i++) {
			String st = sc.next();
			boolean b = false;
			for (int k = 0; k < st.length(); k++) {
				if (st.length() <= 2) {
					cnt++;
					break;
				}
				if (k > 1 && st.charAt(k) != st.charAt(k - 1)) {
					for (int j = 0; j < k - 1; j++) {
						if (st.charAt(k) != st.charAt(j)) {
							b = true;
						} else if (st.charAt(k) == st.charAt(j)) {
							b = false;
							break;
						}

					}
					if (b == false) {
						break;
					}

				} else {
					b = true;
				}

				if (k == st.length() - 1 && b == true) {
					cnt++;
				}
			}

		}
		System.out.println(cnt);

	}
}
