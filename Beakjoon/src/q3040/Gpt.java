package q3040;

import java.util.Scanner;

public class Gpt {

	public static void main(String[] args) {
		 Scanner inp = new Scanner(System.in);
	        int[] num = new int[9];

	        // 9���� ���� �Է� �ޱ�
	        for (int i = 0; i < num.length; i++) {
	            num[i] = inp.nextInt();
	        }
	        inp.close();

	        // 7���� ������ �����Ͽ� ���� 100�� �Ǵ� ���� ã��
	        outerLoop:
	        for (int i = 0; i < 9; i++) {
	            for (int j = i + 1; j < 9; j++) {
	                // �� ���� ������ ������ �� ���
	                int sum = 0;
	                for (int k = 0; k < 9; k++) {
	                    if (k != i && k != j) {
	                        sum += num[k];
	                    }
	                }
	                // ���� 100�� �Ǵ� ���� ã���� ��� �� ����
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