package q2741; //자연수 N이 주어졌을 때, 1부터 N까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
		
		int n = inp.nextInt();
		
		inp.close();
		

			int out = 1;
			
			 while (out < n) {
		            System.out.println(out);
		            out++;
			 }
			
			
			
			System.out.println(n);
		}
	}




