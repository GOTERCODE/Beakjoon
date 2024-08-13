package q3135;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		int n = sc.nextInt();

		int[] arr = new int[n];

		int c = 0;
		int cnt = 0;
		if (a < b) {
			c = b - a;
		} else if (b < a) {
			c = a - b;
		}

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			if(arr[i]==b) {
				System.out.println("1");
				break;
			}
			
			if (arr[i] > b && arr[i] - b < c) {
				c = arr[i] - b;
				cnt = 1;
			} else if (arr[i] < b && b - arr[i] < c) {
				c = b - arr[i];
				cnt = 1;
			}
		}

		if (b > c) {
			cnt += b - c;
		} else if (c > b) {
			cnt += c - b;
		}
		
		System.out.println(cnt);
		

	}

}
