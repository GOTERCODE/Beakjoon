package q3040; //아홉 개의 수 중 합이 100이 되는 일곱 개의 수를 찾으시오

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int[] num = new int[9];

		for (int i = 0; i < num.length; i++) {
			num[i] = inp.nextInt();
		}
		inp.close();

		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i] + " ");
		}
		//9개 수 합 구하기
		int sum = 0;
		for(int i=0;i<num.length; i++) {
			sum += num[i];
		}
		System.out.println("sum : " + sum);
		//합계에서 제외 할 2개의 수를 선정
		int ai = -1, aj = -1;
		for(int i=0;i<num.length;i++) {
			for(int j = 0; j < num.length; j++) {
				if(i != j)	//인덱스 값이 같지 않은 수를 출력하도록 조건 부여
				System.out.print(i + " : " + j + " = " + (num[i] + num[j]));
				System.out.println("~> " + (sum - (num[i] + num[j])));
				
				if((sum - (num[i] + num[j]) == 100)) {
					ai = i;
					ai = j;
					break;
				}
			}
		}
		
	
	for(int k=0; k < num.length; k++) {
		if(k != ai && k != aj)
			System.out.println(num[k]);
	}
}
}