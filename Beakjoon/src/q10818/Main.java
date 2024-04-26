package q10818;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int n[] = new int[t];
		
		for (int i = 0; i < t; i++) {
			n[i] = sc.nextInt();
			
		}
		sc.close();
		Arrays.sort(n);
		System.out.println(n[0] + " " + n[t-1]);
		
	}

}
