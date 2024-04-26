package q11720;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		String st = sc.next();
		sc.close();
		char[] ch = st.toCharArray();
		
		int sum = 0;
		for (int i = 0; i < cnt; i++) {
			int n = Character.getNumericValue(ch[i]);
			sum = sum + n;
		}
		
		System.out.println(sum);
	}

}
