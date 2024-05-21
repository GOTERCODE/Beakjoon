package q4493;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int tc = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < tc; i++) {
			int p1 = 0;
			int p2 = 0;
			int game = sc.nextInt();
			sc.nextLine();
			for (int j = 0; j < game; j++) {

				String st = sc.nextLine();
				if (st.equals("P R") || st.equals("S P") || st.equals("R S")) {
					p1++;
				} else if (st.equals("R P") || st.equals("P S") || st.equals("S R")) {
					p2++;
				}
				
				
			}
			if (p1 > p2) {
				System.out.println("Player 1");
				
			} else if (p2 > p1) {
				System.out.println("Player 2");
				
			} else {
				System.out.println("TIE");
				
			}
			
		}
		sc.close();
	}

}
