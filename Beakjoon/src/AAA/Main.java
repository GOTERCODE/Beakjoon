package AAA;

import java.util.Scanner;

class Inf {
	public void Info() {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		sc.close();
		System.out.println("10큰수 : " + (N+10));
		System.out.println("10작은수 : " + (N-10));
	}
}

public class Main {
	public static void main(String[] args) {
		Inf inf = new Inf(); 
		inf.Info();
		
		
	}
}