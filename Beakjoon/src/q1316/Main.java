package q1316;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		int result = tc;
		char[] alp = new char[26];
		int[] alpCnt = new int[26];
		for (int i = 0; i < 26; i++) {
			alp[i] = (char) ((char) 'a' + i);
		}

		for (int i = 0; i < tc; i++) {
			String st = sc.nextLine();
			char arr[] = new char[st.length()];
			for (int j = 0; j < st.length(); j++) {
				arr[j] = st.charAt(j);
			}
			for (int j = 1; j < st.length(); j++) {
				for (int k = 0; k < 26; k++) {
					if (arr[j] == alp[k] && arr[j] != arr[j - 1]) {
						alpCnt[k]++;
					}
				}
			}
			for (int j = 0; j < 26; j++) {
				if (alpCnt[j] > 1) {
					result--;
					break;

				}

			}

		}
		System.out.println(result);
	}
}
