package q2935;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String st = sc.next();
		String b = sc.next();
		sc.close();
		if (st.equals("*")) {
			System.out.print(a);
			for (int i = 0; i < b.length() - 1; i++) {
				System.out.print("0");
			}
		} else if (st.equals("+")) {
			if (a.length() > b.length()) {

				char chA[] = a.toCharArray();

				chA[a.length() - b.length()]++;
				for (int i = 0; i < a.length(); i++) {
					System.out.print(chA[i]);
				}

			} else if (b.length() > a.length()) {

				char chB[] = b.toCharArray();
				chB[b.length() - a.length()]++;

				for (int i = 0; i < b.length(); i++) {
					System.out.print(chB[i]);
				}

			} else if (b.length() == a.length()) {

				char chB[] = b.toCharArray();

				chB[0]++;

				for (int i = 0; i < b.length(); i++) {
					System.out.print(chB[i]);
				}

			}
		}

	}
}
