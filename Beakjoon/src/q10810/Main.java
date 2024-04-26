package q10810;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int bucketT = sc.nextInt();
		int cnt = sc.nextInt();
		int bucket[] = new int[bucketT];
		
		for(int i = 0 ; i<cnt ;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			for(int j=a; j<=b; j++) {
				bucket[j-1] = c;
			}
			
		}
		sc.close();
		for(int i =0 ; i<bucketT;i++) {
			System.out.println(bucket[i]);
		}
		

	}

}
