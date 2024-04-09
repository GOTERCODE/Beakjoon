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
	





/*정수를 저장하는 큐를 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.

명령은 총 여섯 가지이다.

push X: 정수 X를 큐에 넣는 연산이다.
pop: 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
size: 큐에 들어있는 정수의 개수를 출력한다.
empty: 큐가 비어있으면 1, 아니면 0을 출력한다.
front: 큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
back: 큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.*/