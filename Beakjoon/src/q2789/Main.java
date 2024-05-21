package q2789;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String remover = "CAMBRIDGE";
		String inp = sc.next();
		
		sc.close();
		for (char c : remover.toCharArray()) {
			inp = inp.replace(String.valueOf(c), "");
		}
		System.out.println(inp);
	}

}
