package q2754;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st = sc.next();
		sc.close();
		if (st.equals("F")) {
			System.out.println("0.0");
		} else {
			char[] ch = st.toCharArray();

			double score = 0;

			if (ch[0] == 'A') {
				score = 4;
			} else if (ch[0] == 'B') {
				score = 3;
			} else if (ch[0] == 'C') {
				score = 2;
			} else if (ch[0] == 'D') {
				score = 1;
			}
				if (ch[1] == '+') {
					score += 0.3;
				} else if (ch[1] == '-') {
					score -= 0.3;
				}

			
			System.out.printf("%.1f", score);
		}

	}
}
