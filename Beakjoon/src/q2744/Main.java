package q2744;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String st = sc.next();
		char[] ch = st.toCharArray();
		
		for(int i = 0; i<st.length();i++) {
			if(ch[i]<97) {
				ch[i]=(char) (ch[i]+32);
			}else if(ch[i]>=97) {
				ch[i]=(char) (ch[i]-32);
			}
		}
		System.out.println(ch);
		sc.close();
		

	}

}
