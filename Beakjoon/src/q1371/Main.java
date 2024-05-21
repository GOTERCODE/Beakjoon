package q1371;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] alpArray = new char[26];
        int ascii = 97;
        int[] cnt = new int[26];
        String st = ""; // 빈 문자열로 초기화

        while (sc.hasNextLine()) {
            String inp = sc.nextLine();
            if (inp.isEmpty()) // 입력이 비어있을 때 반복문 종료
                break;
            st += inp; // 각 줄을 누적하여 문자열 연결
        }

        sc.close();
        char[] ch = st.toCharArray();
        // 알파벳 배열 초기화
        for (int i = 0; i < 26; i++) {
            alpArray[i] = (char) (ascii + i);
        }

        // 입력된 문자열에서 각 알파벳의 개수를 세기
        for (int i = 0; i < st.length(); i++) {
            for (int j = 0; j < 26; j++) {
                if (ch[i] == alpArray[j]) {
                    cnt[j]++;
                    break; // 문자가 발견되면 다음 알파벳으로 이동
                }
            }
        }

        // 등장 횟수가 가장 많은 알파벳 출력
        int maxCnt = 0;
        for (int i = 0; i < 26; i++) {
            if (cnt[i] > maxCnt) {
                maxCnt = cnt[i];
            }
        }

        for (int i = 0; i < 26; i++) {
            if (cnt[i] == maxCnt) {
                System.out.print(alpArray[i]);
            }
        }
    }
}


