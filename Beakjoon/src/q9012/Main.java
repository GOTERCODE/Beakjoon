package q9012;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			int point = 0;
			String ps = sc.next();
			char[] arr = ps.toCharArray();
			for (int j = 0; j < arr.length; j++) {
				
				
				if (arr[0] == ')') {
					System.out.println("NO");
					break;
				} 
					if (arr[j] == '(') {
					point++;
				}
					if (arr[j] == ')') {
					point--;
					if (point < 0) {
						System.out.println("NO");
						break;
					}
					if (point == 0) {
						System.out.println("YES");
					} else if (point > 0) {
						System.out.println("NO");
					}
				}

			}

		}
		sc.close();
	}

}
