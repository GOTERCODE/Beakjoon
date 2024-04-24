package q25304;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int ea = sc.nextInt();
		int sumM = 0;
		for (int i = 0; i < ea; i++) {
			int cost = sc.nextInt();
			int ea2 = sc.nextInt();
			int sum = cost*ea2;
			sumM = sumM+sum;
		}
		sc.close();
		if(M==sumM) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}
