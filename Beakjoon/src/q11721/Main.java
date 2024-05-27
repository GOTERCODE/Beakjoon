package q11721;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st = sc.next();
		char[] ch = st.toCharArray();

		for (int i = 0; i < st.length(); i++) {
			System.out.print(ch[i]);
			if((i+1)%10==0) {
				System.out.println("");
			}
		}

	}

}
