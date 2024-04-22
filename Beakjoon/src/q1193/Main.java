package q1193;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();
		sc.close();

		int i = 1;
		int j = 1;
		
		for (int k = 0; k < inp; k++) {
			for (i = 1; i > 0; i++) {
				if (i == 1) {
					j++;
					

				}
				for (j = 1; j > 0; j++) {
					if (j == 1) {
						i++;
						

					}

				}
				
				System.out.println(i+"/"+j);
			}
			
		}
	}
}
