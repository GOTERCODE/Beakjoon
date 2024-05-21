package q4447;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < cnt; i++) {
			String st = sc.nextLine();

			int bcnt = 0;
			int gcnt = 0;
			for (int j = 0; j < st.length(); j++) {
				char ch = st.charAt(j);
				if (ch == 'g' || ch == 'G') {
					gcnt++;
				} else if (ch == 'b' || ch == 'B') {
					bcnt++;
				}
			}
			if(gcnt>bcnt) {
				System.out.println(st + " is GOOD");
			}else if(bcnt>gcnt) {
				System.out.println(st + " is A BADDY");
			}else {
				System.out.println(st + " is NEUTRAL");
			}
		}
		sc.close();
	}

}
