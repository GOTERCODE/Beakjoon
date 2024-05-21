package q1440;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st = sc.next();
		sc.close();
		char[] ch = st.toCharArray();

		int cnt = 0;
		int t1 = ch[0] - 48;
		int t2 = ch[1] - 48;
		int t3 = ch[3] - 48;
		int t4 = ch[4] - 48;
		int t5 = ch[6] - 48;
		int t6 = ch[7] - 48;

		String T1 = Integer.toString(t1);
		String T2 = Integer.toString(t2);
		String T3 = Integer.toString(t3);
		String T4 = Integer.toString(t4);
		String T5 = Integer.toString(t5);
		String T6 = Integer.toString(t6);

		String H = T1 + T2;
		String M = T3 + T4;
		String S = T5 + T6;

		Integer HH = Integer.valueOf(H);
		Integer MM = Integer.valueOf(M);
		Integer SS = Integer.valueOf(S);

		if (HH <= 12) {
			cnt += 2;
		}
		if (MM <= 12) {
			cnt += 2;
		}
		if (SS <= 12) {
			cnt += 2;
		}

		if (HH == 00) {
			cnt -= 2;
		}
		if (MM == 00) {
			cnt -= 2;
		}
		if (SS == 00) {
			cnt -= 2;
		}

		if (HH == 0 && MM == 0 && SS == 0) {
			cnt = 0;
		}

		System.out.println(cnt);
	}

}
