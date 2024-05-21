package q2947;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] n = new int[5];
		int save = 0;
		for (int i = 0; i < 5; i++) {
			n[i] = sc.nextInt();
		}

		for (int i = 0; i < 4; i++) {
			if (n[i] > n[i + 1]) {
				save = n[i];
				n[i] = n[i + 1];
				n[i + 1] = save;
				System.out.println(n[i] + " ");
				
			}
			for(int j = 0;j<5;j++) {
				if(n[j]!=j+1) {
					
				}
			}
		}

	}

}
