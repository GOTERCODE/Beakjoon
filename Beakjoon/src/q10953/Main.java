package q10953;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();

		for (int i = 0; i < tc; i++) {
			String st = sc.next();
			char[] ch = st.toCharArray();
			System.out.println((ch[0] - 48) + (ch[2] - 48));
		}
		sc.close();
	}

}
