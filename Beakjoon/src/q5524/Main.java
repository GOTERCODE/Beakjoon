package q5524;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();

		for (int i = 0; i < tc; i++) {
			
			String st = sc.next();
			char ch[] = st.toCharArray();

			for (int j = 0; j < st.length(); j++) {

				if (ch[j] < 97) {
					System.out.print((char) (ch[j] + 32));
				} else {
					System.out.print(ch[j]);
				}

			}
			System.out.println();
		}
		sc.close();
	}

}
