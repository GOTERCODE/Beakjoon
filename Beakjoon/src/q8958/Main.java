package q8958;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		
		for (int i = 0; n > i; i++) {

			int point = 0;
			int up = 0;
			
			String ox = sc.next();
			String[] arr = ox.split("");
			for (int j = 0; j < arr.length; j++) {
				if (arr[j].equals("O")) {
					
					up ++;
					
					point = point+up;
					

				}else {
					up = 0;
				}
				
			}
			
			System.out.println(point);
			
		}
		
		sc.close();
	}
	
}

/*
 * "OOXXOXXOOO"�� ���� OX������ ����� �ִ�. O�� ������ ���� ���̰�, X�� ������ Ʋ�� ���̴�. ������ ���� ��� �� ������
 * ������ �� �������� ���ӵ� O�� ������ �ȴ�. ���� ���, 10�� ������ ������ 3�� �ȴ�.
 * 
 * "OOXXOXXOOO"�� ������ 1+2+0+0+1+0+0+1+2+3 = 10���̴�.
 * 
 * OX������ ����� �־����� ��, ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */