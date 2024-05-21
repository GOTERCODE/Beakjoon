package q2484;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] dice = new int[4];
		
		int testcase = sc.nextInt();
		int[] money = new int[testcase];
		for (int i = 0; i < testcase; i++) {
			for(int j=0;j<4;j++) {
				dice[j] = sc.nextInt();
				
			}
			Arrays.sort(dice);
			
			if(dice[0]==dice[1]&&dice[0]==dice[2]&&dice[2]==dice[3]) {
				money[i] = 50000+dice[0]*5000;
			}else if(dice[0]==dice[1]||dice[0]==dice[2]||dice[0]==dice[3]) {
				money[i] = 10000+dice[0]*1000;
			}else if(dice[1]==dice[2]) {
				money[i] = 1000+dice[1]*100;
			}else {
				money[i] = dice[2]*100;
			}
			
		}
		
		Arrays.sort(money);
		System.out.println(money[testcase-1]);
		sc.close();

	}

}
