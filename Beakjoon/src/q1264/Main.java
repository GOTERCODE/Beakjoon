package q1264;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean b = true;
		while (b) {
			String st = sc.nextLine();
			int cnt = 0;
			if (st.equals("#")) {
				b = false;
				break;
			}
			for (int i = 0; i < st.length(); i++) {

				char ch = st.charAt(i);
				if (ch == 'a'||ch == 'i'||ch == 'u'||ch == 'e'||ch == 'o'||ch == 'A'||ch == 'I'||ch == 'U'||ch == 'E'||ch == 'O') {
					cnt++;
				}
			}
			System.out.println(cnt);
		}
		sc.close();
	}

}
