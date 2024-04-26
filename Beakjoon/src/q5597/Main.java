package q5597;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s[] = new int[30];
		s[28] = 100;
		s[29] = 100;
		
		int arr[] = new int[30];
		int j = 0;
		int cnt = 0;
		for (int i = 0; i < 28; i++) {
			s[i] = sc.nextInt();
		}
		sc.close();

		Arrays.sort(s);
		for (int i = 0; i < 30; i++) {
			arr[i] = i + 1;
		}

		for (int i = 0; i < 30; i++) {
			if (s[i] != arr[j]) {
				System.out.println(arr[j]);
				i--;
				j++;
				cnt++;
			} else {
				j++;
			}
			if (cnt == 2) {
				break;
			}

		}

	}

}
