package q10419;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();

		for (int i = 0; i < tc; i++) {
			int d = sc.nextInt();
			for(int j=0;j<10000;j++) {
				if(j+(j*j)>d) {
					System.out.println(j-1);
					break;
				}
			}
		}
		sc.close();

	}

}
