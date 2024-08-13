package q1543;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String st = sc.nextLine();
		String find = sc.nextLine();
		int cnt = 0;
		
		for (int i = 0; i <= st.length()-1; i++) {

			if (st.length() - i >= find.length()) {

				if (st.charAt(i) == find.charAt(0)) {
					boolean b = false;
					for (int j = 0; j <= find.length()-1; j++) {
						if (st.charAt(i + j) == find.charAt(j)) {
							b = true;
						} else {
							b = false;
							break;
						}

						
					}
					if (b == true) {
						cnt++;
						i += find.length()-1;
					}
				}
			}
		}
		System.out.println(cnt);

	}

}
