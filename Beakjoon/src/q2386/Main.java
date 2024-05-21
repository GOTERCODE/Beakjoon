package q2386;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int cnt = 0;
			String ch = sc.next();
			String st = sc.nextLine();
			char[] ch1 = ch.toCharArray();
			char[] ch2 = st.toCharArray();

			if (ch.equals("#")) {
				break;
			}

			for (int i = 0; i < st.length(); i++) {
				if (ch1[0] == (ch2[i])) {
					cnt++;
				} else if ((ch1[0] - 32) == ch2[i]) {
					cnt++;
				}
			}
			
			System.out.println(ch + " " + cnt);

		}
	}

}
