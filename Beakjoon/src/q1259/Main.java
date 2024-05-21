package q1259;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			String N = sc.next();
			int cnt =0;
			if (N.equals("0")) {
				break;
			}
			int[] arr = new int[N.length()];
			int[] reverseArr = new int[N.length()];
			for (int i = 0; i < N.length(); i++) {
				arr[i] = N.charAt(i);
			}
			for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
				reverseArr[j] = arr[i];
			}
			for(int i = 0; i<arr.length;i++) {
				if(arr[i]!=reverseArr[i]) {
					System.out.println("no");
					break;
				}else if(arr[i]==reverseArr[i]) {
					cnt++;
				}
				
				
			}
			if(cnt == arr.length) {
				System.out.println("yes");
			}
		}
		sc.close();

	}

}
