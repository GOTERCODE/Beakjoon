package q3052;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int cnt = 1;
		int res[] = new int[10];
		for (int i = 0; i < 10; i++) {
			int inp = sc.nextInt();
			res[i] = inp % 42;
		}
		sc.close();
		Arrays.sort(res);
		for (int i = 0; i < 9; i++) {
			int j = i+1;
			if(res[i]!=res[j]) {
				cnt++;
			}
		}
		System.out.println(cnt);

	}

}
