package q24723;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		sc.close();

		int a = 1;
		for (int i = 0; i < n; i++) {
			a *= 2; 
		}
		
		System.out.println(a);
			
	}

}
