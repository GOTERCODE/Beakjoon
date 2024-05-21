package q1316;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		char[] alp = new char[26];
		int [] check = new int[26];
		for (int i = 0; i < 26; i++) {
			alp[i] = (char) (97+i);
			check[i] = i;
		}

		for (int i = 0; i < testcase; i++) {
			String st = sc.nextLine();
			char[] ch = st.toCharArray();
			for(int j = 0;j<26;j++) {
				if(ch[i]==alp[j]) {
					j++;
				}
				if(i>0) {
					if(ch[i]!=ch[i-1]) {
						for(int k=0;k<i;k++) {
							if(ch[i]==ch[k]) {
								
							}
						}
					}
				}
			}
			
		}
		

		
	}

}
