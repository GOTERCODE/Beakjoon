package q9469;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		
		for(int i =0;i<cnt;i++) {
			int testcase = sc.nextInt();
			double D = sc.nextDouble();
			double A = sc.nextDouble();
			double B = sc.nextDouble();
			double F = sc.nextDouble();
			
			System.out.printf("%d %.6f", testcase, (D / (A + B) * F));
			System.out.println("");
		}
		sc.close();
	}

}
