package q2935;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Long a = sc.nextLong();
		sc.nextLine();
		String st = sc.next();
		sc.nextLine();
		Long b = sc.nextLong();

		sc.close();

		if (st.equals("+")) {
			System.out.println(a + b);
		} else if (st.equals("*")) {
			System.out.println(a * b);
		}

	}

}
