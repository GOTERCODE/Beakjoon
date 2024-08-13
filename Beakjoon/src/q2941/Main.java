package q2941;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String st = sc.next();
		sc.close();
		int cnt = 0;
		for (int i = 0; i < st.length(); i++) {
			if (i + 1 <= st.length() - 1) {
				if (st.charAt(i) == 'c') {
					if (st.charAt(i + 1) == '=' || st.charAt(i + 1) == '-') {
						cnt++;
						i++;
					}else {
						cnt++;
					}
				} else if (st.charAt(i) == 'd') {
					if (i + 2 <= st.length() - 1 && st.charAt(i + 1) == 'z') {
						if (st.charAt(i + 2) == '=') {
							cnt++;
							i += 2;
						} else {
							cnt++;
						}
					} else if (st.charAt(i + 1) == '-') {
						cnt++;
						i++;
					} else {
						cnt++;
					}
				} else if (st.charAt(i) == 'l') {
					if (st.charAt(i + 1) == 'j') {
						cnt++;
						i++;
					} else {
						cnt++;
					}
				} else if (st.charAt(i) == 'n') {
					if (st.charAt(i + 1) == 'j') {
						cnt++;
						i++;
					} else {
						cnt++;
					}
				} else if (st.charAt(i) == 's') {
					if (st.charAt(i + 1) == '=') {
						cnt++;
						i++;
					} else {
						cnt++;
					}
				} else if (st.charAt(i) == 'z') {
					if (st.charAt(i + 1) == '=') {
						cnt++;
						i++;
					} else {
						cnt++;
					}
				} else {
					cnt++;
				}
			} else {
				cnt++;
			}
		}
		System.out.println(cnt);

	}

}
