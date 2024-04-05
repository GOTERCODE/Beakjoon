package AAA;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        sc.close();
	        int i=0;
	        if(i==(n%2))  {
	        	System.out.println(n + " is even");
	        }else {
	        	System.out.println(n + " is odd");
	        }
	}
}