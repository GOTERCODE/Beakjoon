package q18870;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		
		int[] arr = new int[N];
		int arrS;
		
		
		for(int i=0;i<N;i++) {
			arr[i]=sc.nextInt();
			
			for(int j=i+1;j<N;j++) {
				if(arr[i]<arr[j]) {
					
				}
				
			}
			
			
			
			
		}

	}

}


/*������ ���� N���� ��ǥ X1, X2, ..., XN�� �ִ�. �� ��ǥ�� ��ǥ ������ �����Ϸ��� �Ѵ�.

Xi�� ��ǥ ������ ��� X'i�� ���� Xi > Xj�� �����ϴ� ���� �ٸ� ��ǥ Xj�� ������ ���ƾ� �Ѵ�.

X1, X2, ..., XN�� ��ǥ ������ ������ ��� X'1, X'2, ..., X'N�� ����غ���.*/