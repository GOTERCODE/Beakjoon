package q2588;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
		int int1 = sc.nextInt();
		int int2 = sc.nextInt();
		sc.close();
		
		int n = int2 % 10;
		
		
		System.out.println(int1*n);
		
		int n2 = int2 / 10 % 10;
		
		System.out.println(int1*n2);
		
		int n3 = int2 / 100;
		
		System.out.println(int1*n3);

        }
		
	}


