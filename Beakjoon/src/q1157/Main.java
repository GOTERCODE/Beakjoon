package q1157;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st = sc.next();
		sc.close();
		char[] ch = st.toCharArray();
		char[] alp = new char[26];
		int[] cnt = new int[26];
		int[] cnt2 = new int[26];
		for (int i = 0; i < 26; i++) {
			alp[i] = (char) (65 + i);
		}

		for (int i = 0; i < st.length(); i++) {
			for (int j = 0; j < 26; j++) {
				if (ch[i] == alp[j] || ch[i] == (alp[j] + 32)) {
					cnt[j]++;
					cnt2[j]++;
				}
			}
		}
		
		
		Arrays.sort(cnt);
		if (cnt[25] == cnt[24]) {
			System.out.println("?");
		} else {

			for (int j = 0; j < 26; j++) {
				if (cnt2[j] == cnt[25]) {
					System.out.println(alp[j]);
				}

			}
		}

	}

}
