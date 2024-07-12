package q10162;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.close();
		int A = 0;
		int B = 0;
		int C = 0;
		while (true) {
			
			
			if (t % 10 != 0) {
				System.out.println("-1");
				break;
			}
			
			
			if (t >= 300) {
				t -= 300;
				A++;
			} else if (t >= 60) {
				t -= 60;
				B++;
			} else if (t >= 10) {
				t -= 10;
				C++;
			}
			if (t == 0) {
				System.out.println(A + " " + B + " " + C);
				break;
			}
			
		}

	}

}
