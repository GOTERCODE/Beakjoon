package q2839;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		int cnt = 0;

		while (true) {

			if (N % 5 == 0) {
				System.out.println(N / 5);
				break;
			}
			
			

			if (N >= 5 && N - 5 > 3 && (N-5)%3==0) {
				N -= 5;
				cnt++;
			} else if (N >= 3) {
				N -= 3;
				cnt++;
			} 
			
			if(N==0) {
				System.out.println(cnt);
				break;
			}else if(N>0&&N<3) {
				System.out.println("-1");
				break;
			}

		}

	}

}
