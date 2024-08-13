package q14490;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String st = sc.next();
		sc.close();
		String a = new String();
		String b = new String();

		boolean bool = true;
		for (int i = 0; i < st.length(); i++) {
			if (st.charAt(i) == ':') {
				bool = false;

			}

			if (bool == true) {

				a += st.charAt(i);
			} else if (bool == false && st.charAt(i) != ':') {
				b += st.charAt(i);
			}
		}

		int aInt = Integer.parseInt(a);
		int bInt = Integer.parseInt(b);

		if (aInt > bInt) {
			for (int i = bInt; i > 0; i--) {
				if (aInt % i == 0 && bInt % i == 0) {
					System.out.println(aInt / i + ":" + bInt / i);
					break;
				}
			}
		} else {
			for (int i = aInt; i > 0; i--) {
				if (bInt % i == 0 && aInt % i == 0) {
					System.out.println(aInt / i + ":" + bInt / i);
					break;
				}
			}

		}
	}
}
