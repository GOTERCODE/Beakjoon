package q21567;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		long nr =(long) n1 * n2 * n3;
		int[] cnt = new int[10];
		String st = nr + "";
		for (int i = 0; i < st.length(); i++) {
			char ch = st.charAt(i);
			for (int j = 0; j < 10; j++) {
				String stv = String.valueOf(ch);
				int inv = Integer.valueOf(stv);
				if (inv == j) {
					cnt[j]++;
				}
			}
		}
		
		sc.close();
		
		for (int i = 0; i < 10; i++) {
			System.out.println(cnt[i]);
		}
		

	}

}
