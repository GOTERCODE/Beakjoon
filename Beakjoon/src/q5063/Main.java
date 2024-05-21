package q5063;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		for (int i = 0; i < cnt; i++) {
			int r = sc.nextInt();
			int e = sc.nextInt();
			int c = sc.nextInt();
			if((e-c)==r) {
				System.out.println("does not matter");
			}else if((e-c)>r) {
				System.out.println("advertise");
			}else {
				System.out.println("do not advertise");
			}
		}
		sc.close();
	}

}
