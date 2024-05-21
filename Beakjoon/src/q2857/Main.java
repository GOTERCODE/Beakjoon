package q2857;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int found = 0;
		for (int i = 0; i < 5; i++) {
			String name = sc.nextLine();
			char[] nameCh = name.toCharArray();
			for (int j = 0; j < name.length() - 2; j++) {
				String st = "" + nameCh[j] + nameCh[j + 1] + nameCh[j + 2];

				if (st.equals("FBI")) {
					System.out.print((i + 1) + " ");
					found++;
					break;
				}
				
			}
			
		}
		
		if(found==0) {
			System.out.println("HE GOT AWAY!");
		}
		
		
		sc.close();

	}

}
