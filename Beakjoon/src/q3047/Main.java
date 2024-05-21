package q3047;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] n = new int[3];
		for (int i = 0; i < 3; i++) {
			n[i] = sc.nextInt();
		}
		Arrays.sort(n);
		sc.nextLine();

		String st = sc.nextLine();

		if (st.equals("ABC")) {
			System.out.println(n[0] + " " + n[1] + " " + n[2]);
		} else if (st.equals("BAC")) {
			System.out.println(n[1] + " " + n[0] + " " + n[2]);
		} else if (st.equals("CAB")) {
			System.out.println(n[2] + " " + n[0] + " " + n[1]);
		} else if (st.equals("ACB")) {
			System.out.println(n[0] + " " + n[2] + " " + n[1]);
		} else if (st.equals("BCA")) {
			System.out.println(n[1] + " " + n[2] + " " + n[0]);
		} else if (st.equals("CBA")) {
			System.out.println(n[2] + " " + n[1] + " " + n[0]);
		}
		sc.close();
	}

}
