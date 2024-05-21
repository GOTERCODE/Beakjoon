package q1152;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		sc.close();
		int cnt = 0;

		for (int i = 0; i < st.length(); i++) {

			if (st.charAt(i) == ' ') {
				cnt++;
			}
		}
		if (st.charAt(0) == ' ') {
			cnt--;
		}
		if (st.charAt(st.length() - 1) == ' ') {
			cnt--;
		}
		System.out.println(cnt + 1);

	}

}
