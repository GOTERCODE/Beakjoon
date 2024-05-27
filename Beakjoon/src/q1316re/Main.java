package q1316re;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] cnt = new int[26];
		char[] alp = new char[26];

		for (int i = 0; i < 26; i++) {
			alp[i] = (char) ((char) i + 97);
		}

		int tc = sc.nextInt();
		int out = tc;
		for (int i = 0; i < tc; i++) {

			for (int a = 0; a < 26; a++) {
				cnt[a] = a;
			}

			String st = sc.nextLine();
			char[] ch = st.toCharArray();

			for (int j = 0; j < st.length(); j++) {
				for (int k = 0; j < 26; k++) {
					if (ch[j] == alp[k]) {
						cnt[k]++;
					}
				}
			}

			for (int j = 0; i < 26; i++) {
				if (cnt[j] > 1) {
					out--;
				}
			}

		}
		System.out.println(out);

	}

}
