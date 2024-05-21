package q10102;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int cnt = sc.nextInt();
		sc.nextLine();
		String st = sc.nextLine();
		sc.close();
		char[] ch = st.toCharArray();
		int Acnt = 0;
		int Bcnt = 0;

		for (int i = 0; i < cnt; i++) {
			if(ch[i] == 'A') {
				Acnt++;
			}else if(ch[i]=='B') {
				Bcnt++;
			}
		}
		
		if(Acnt>Bcnt)
			System.out.println("A");
		if(Bcnt>Acnt)
			System.out.println("B");
		if(Acnt==Bcnt)
			System.out.println("Tie");
	}

}
