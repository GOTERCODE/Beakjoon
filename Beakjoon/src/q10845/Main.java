package q10845;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> q = new LinkedList<>();

        while (sc.hasNext()) {
            String cmd = sc.next();

            switch (cmd) {
                case "push":
                    int param = sc.nextInt();
                    q.offer(param);
                    break;
                case "pop":
                    if (q.isEmpty()) {
                        System.out.println("-1");
                    } else {
                        int ret = q.poll();
                        System.out.println(ret);
                    }
                    break;
                case "size":
                    System.out.println(q.size());
                    break;
                case "empty":
                    if (q.isEmpty()) {
                        System.out.println(1);
                    } else {
                        System.out.println(0);
                    }
                    break;
                case "front":
                    if (q.isEmpty()) {
                        System.out.println("-1");
                    } else {
                        System.out.println(q.peek()); 
                    }
                    break;
                case "back":
                    if (q.isEmpty()) {
                        System.out.println("-1");
                    } else {
                        System.out.println(getBack(q));
                    }
                    break;
                default:
                    break;
            }
        }
        sc.close();
    }


    private static int getBack(Queue<Integer> q) {
        int back = -1;
        for (int num : q) {
            back = num;
        }
        return back;
    }
}
	





/*������ �����ϴ� ť�� ������ ����, �Է����� �־����� ����� ó���ϴ� ���α׷��� �ۼ��Ͻÿ�.

����� �� ���� �����̴�.

push X: ���� X�� ť�� �ִ� �����̴�.
pop: ť���� ���� �տ� �ִ� ������ ����, �� ���� ����Ѵ�. ���� ť�� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
size: ť�� ����ִ� ������ ������ ����Ѵ�.
empty: ť�� ��������� 1, �ƴϸ� 0�� ����Ѵ�.
front: ť�� ���� �տ� �ִ� ������ ����Ѵ�. ���� ť�� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
back: ť�� ���� �ڿ� �ִ� ������ ����Ѵ�. ���� ť�� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.*/