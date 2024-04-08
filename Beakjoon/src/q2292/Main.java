package q2292;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inp = sc.nextInt();
        sc.close();

        int six = 6;
        int count = 1; // 바깥쪽으로 나아가는 층 수 (1부터 시작)

        // 입력된 숫자가 속한 범위를 계산하여 count를 구함
        while (inp > 1) {
            inp -= six * count; // 현재 층의 최댓값을 뺌
            count++; // 다음 층으로 이동
        }

        System.out.println(count); // 결과 출력
    }
}