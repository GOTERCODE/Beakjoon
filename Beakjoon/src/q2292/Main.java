package q2292;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inp = sc.nextInt();
        sc.close();

        int six = 6;
        int count = 1; // �ٱ������� ���ư��� �� �� (1���� ����)

        // �Էµ� ���ڰ� ���� ������ ����Ͽ� count�� ����
        while (inp > 1) {
            inp -= six * count; // ���� ���� �ִ��� ��
            count++; // ���� ������ �̵�
        }

        System.out.println(count); // ��� ���
    }
}