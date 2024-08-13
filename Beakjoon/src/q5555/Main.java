package q5555;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inp = sc.next();
		int tc = sc.nextInt();
		int cnt = 0;
		for (int i = 0; i < tc; i++) {
			String st = sc.next();
			String st2 = st + st;
			boolean b = false;
			for (int j = 0; j < st.length(); j++) {

				if (st2.charAt(j) == inp.charAt(0)) {
					for (int k = 0; k < inp.length(); k++) {
						if (st2.charAt(j + k) == inp.charAt(k)) {
							b = true;
						} else {
							b = false;
							break;
						}

					}
					if (b == true) {
						break;
					}
				}
			}

			if (b == true) {
				cnt++;
			}
		}
		sc.close();
		System.out.println(cnt);

	}

}
