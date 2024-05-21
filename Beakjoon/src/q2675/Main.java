package q2675;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();

		for (int i = 0; i < cnt; i++) {
			int n = sc.nextInt();
			String st = sc.next();
			for (int j = 0; j < st.length(); j++) {
				
				for (int k = 0; k < n; k++) {
					System.out.print(st.charAt(j));
				}
				
			}
			System.out.println("");
		}
		sc.close();
	}

}
