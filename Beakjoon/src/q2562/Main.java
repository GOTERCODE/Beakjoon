package q2562;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n[] = new int[9];
		
		for (int i = 0; i < 9; i++) {
			n[i] = sc.nextInt();
			

		}
		sc.close();
		
		int max = Arrays.stream(n).max().getAsInt();
		
		for(int i = 0; i<9;i++) {
			if(max == n[i]) {
				
				System.out.println(max);
				System.out.println(i+1);
			}
		}
		
		

	}

}

// 입력받은 정수중 최댓값을 구하고 그것을 다시 순회하는 과정에서 최댓값이 몇번째로 입력받았느지를 구한다