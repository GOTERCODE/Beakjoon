package q2711;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();

		for (int i = 0; i < tc; i++) {
			int n = sc.nextInt();
			String st = sc.next();
			char[] arr = st.toCharArray();
			arr[n - 1] = '@';
			for (int j = 0; j < st.length(); j++) {
				if (arr[j] != '@') {
					System.out.print(arr[j]);
				}
			}
			System.out.println("");

		}
		sc.close();

	}

}
