package q3040; //��ȩ ���� �� �� ���� 100�� �Ǵ� �ϰ� ���� ���� ã���ÿ�

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
		//9�� �� �� ���ϱ�
		int sum = 0;
		for(int i=0;i<num.length; i++) {
			sum += num[i];
		}
		System.out.println("sum : " + sum);
		//�հ迡�� ���� �� 2���� ���� ����
		int ai = -1, aj = -1;
		for(int i=0;i<num.length;i++) {
			for(int j = 0; j < num.length; j++) {
				if(i != j)	//�ε��� ���� ���� ���� ���� ����ϵ��� ���� �ο�
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