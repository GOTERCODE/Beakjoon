package q5704;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean b = true;

//		----------------------알파벳 배열
		char[] alphabet = new char[26];
		for (int i = 0; i < alphabet.length; i++) {
			alphabet[i] = (char) ('a' + i);
		}

//		----------------------카운트 배열
		int[] cnt = new int[26];
		

		while (b) {
			
			for (int i = 0; i < cnt.length; i++) {
				cnt[i] = 0;
			}
			
			String st = sc.nextLine();

			if (st.equals("*")) {
				b = false;
				sc.close();
				break;
			}

			for (int i = 0; i < st.length(); i++) {
				char ch = st.charAt(i);
				for (int j = 0; j < 26; j++) {
					if (ch == alphabet[j]) {
						cnt[j]++;
					}
				}
			}
			boolean allFound = true;
			for (int i = 0; i < 26; i++) {
				if (cnt[i] < 1) {
					allFound = false;
					System.out.println("N");
					break;
				}
			}
			if (allFound) {
				System.out.println("Y");
			}

		}
		
	}
}