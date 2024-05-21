package q10987;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st = sc.next();
		sc.close();
		char[] ch = { 'a', 'e', 'i', 'o', 'u' };
		char[] ch2 = st.toCharArray();
		int cnt = 0;
		for (int i = 0; i < st.length(); i++) {
			for (int j = 0; j < 5; j++) {
				if(ch2[i] == ch[j]) {
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}

}
