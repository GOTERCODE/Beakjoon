package q9086;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cnt = sc.nextInt();
		
		for (int i = 0; i < cnt; i++) {
			
			String st = sc.next();
			
			
			
			System.out.print(st.charAt(0));
			System.out.print(st.charAt(st.length()-1));
			System.out.println("");
		}
		sc.close();
	}

}
