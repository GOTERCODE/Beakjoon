package q1652;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt1 = 0;
		int cnt2 = 0;

		char[][] ch = new char[n][n];

		for (int i = 0; i < n; i++) {
			String st = sc.next();
			for (int j = 0; j < n; j++) {
				ch[i][j] = st.charAt(j);
			}
		}

		sc.close();

		for (int i = 0; i < n; i++) {
			boolean b = false;
			for (int j = 0; j < n; j++) {

				if (n > j + 1 && ch[i][j] == '.') {

					if (ch[i][j + 1] == '.') {
						b = true;

					}

					
					
				}
				
				if (ch[i][j] == 'X') {
					if (b == true) {
						cnt1++;
						b = false;
					}
				}
				
				if (j + 1 == n) {
					if (b == true) {
						cnt1++;

					}
				}
			}
		}

		
		
		
		for (int j = 0; j < n; j++) {
			boolean b = false;
			for (int i = 0; i < n; i++) {

				if (n > i + 1 && ch[i][j] == '.') {

					if (ch[i+1][j] == '.') {
						b = true;

					}

					
					
				}
				
				if (ch[i][j] == 'X') {
					if (b == true) {
						cnt2++;
						b = false;
					}
				}
				
				if (i + 1 == n) {
					if (b == true) {
						cnt2++;

					}
				}
			}
		}

		System.out.println(cnt1 + " " + cnt2);

	}

}
