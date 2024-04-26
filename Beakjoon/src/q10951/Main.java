package q10951;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNextInt()) {
			int A = sc.nextInt();
			int B = sc.nextInt();

			System.out.println(A + B);
			
		}
		sc.close();
	}
}


//종료조건을 .hasNextInt() 메소드를 사용하여 스캐너에 입력이 없을시 종료하도록 부여