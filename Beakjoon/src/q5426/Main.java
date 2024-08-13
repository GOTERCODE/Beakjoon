package q5426;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = 0;

		for (int i = 0; i < n; i++) {
			String st = sc.next();

			int a = 1;
			while (true) {

				if (a * a == st.length()) {
					m = a;
					break;
				}
				a++;
			}

			char[][] arr = new char[m][m];
			int idx = st.length() - 1;
			for (int j = m - 1; j >= 0; j--) {
				for (int k = 0; k < m; k++) {
					arr[k][j] = st.charAt(idx);
					idx--;
				}
			}

			for (int j = 0; j < m; j++) {
				for (int k = 0; k < m; k++) {
					System.out.print(arr[j][k]);
				}

			}
			System.out.println();
		}
		sc.close();
	}

}
