package q5532;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int L = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		
		int cnt1 = 0;
		int cnt2 = 0;
		
		while(true) {
			A -= C;
			cnt1++;
			if(A <= 0) {
				break;
			}
		}
		
		while(true) {
			B -= D;
			cnt2++;
			if(B <= 0) {
				break;
			}
		}
		
		if(cnt1 > cnt2) {
			System.out.println(L-cnt1);
		}else {
			System.out.println(L-cnt2);
		}

	}

}
