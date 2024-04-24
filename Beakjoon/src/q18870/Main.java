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


/*수직선 위에 N개의 좌표 X1, X2, ..., XN이 있다. 이 좌표에 좌표 압축을 적용하려고 한다.

Xi를 좌표 압축한 결과 X'i의 값은 Xi > Xj를 만족하는 서로 다른 좌표 Xj의 개수와 같아야 한다.

X1, X2, ..., XN에 좌표 압축을 적용한 결과 X'1, X'2, ..., X'N를 출력해보자.*/