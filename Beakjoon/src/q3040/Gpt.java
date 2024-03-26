package q3040;

import java.util.Scanner;

public class Gpt {

	public static void main(String[] args) {
		 Scanner inp = new Scanner(System.in);
	        int[] num = new int[9];

	        // 9개의 정수 입력 받기
	        for (int i = 0; i < num.length; i++) {
	            num[i] = inp.nextInt();
	        }
	        inp.close();

	        // 7개의 정수를 선택하여 합이 100이 되는 조합 찾기
	        outerLoop:
	        for (int i = 0; i < 9; i++) {
	            for (int j = i + 1; j < 9; j++) {
	                // 두 개의 정수를 제외한 합 계산
	                int sum = 0;
	                for (int k = 0; k < 9; k++) {
	                    if (k != i && k != j) {
	                        sum += num[k];
	                    }
	                }
	                // 합이 100이 되는 조합 찾으면 출력 후 종료
	                if (sum == 100) {
	                    for (int k = 0; k < 9; k++) {
	                        if (k != i && k != j) {
	                            System.out.println(num[k]);
	                        }
	                    }
	                    break outerLoop;
	                }
	            }
	        }
	    }
	}