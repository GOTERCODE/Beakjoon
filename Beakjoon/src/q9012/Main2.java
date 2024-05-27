package q9012;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		
		for (int i = 0; i < tc; i++) {
			String st = sc.next();
			char[] ch = st.toCharArray();
			int cnt = 0;
			for (int j = 0; j < st.length(); j++) {
				
				
				if (cnt==0&&ch[j]==')') {
					cnt+=100;
				}
				if (ch[j]=='(') {
					cnt++;					
				}
				if (ch[j]==')') {
					cnt--;
				}
				
				
			}
			if(cnt!=0||ch[0]==')'||cnt>0) {
				System.out.println("NO");
			}else if(cnt==0) {
				System.out.println("YES");
			}
		}
		sc.close();

	}

}
