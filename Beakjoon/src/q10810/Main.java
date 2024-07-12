package q10810;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int bucketT = sc.nextInt(); // 바구니의 갯수
		int cnt = sc.nextInt(); // 공을 넣는 방법 테스트 케이스
		int bucket[] = new int[bucketT];// 바구니 갯수만큼 배열 생성

		for (int i = 0; i < cnt; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt(); // a~b 공을 넣는 바구니의 범위
			int c = sc.nextInt(); // 넣는 공의 번호

			for (int j = a; j <= b; j++) { // 조건 : a부터 b까지
				bucket[j - 1] = c; // 해당하는 인덱스에 공번호(c) 대입
			}

		}
		sc.close();
		for (int i = 0; i < bucketT; i++) {
			System.out.println(bucket[i]); // 1번 바구니 부터 (bucketT)번 바구니까지 들어간 공의 번호 출력
		}

	}

}
