package q10828;

import java.util.Scanner;
import java.util.Stack;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stk = new Stack<Integer>();

        while (sc.hasNext()) {
            String cmd = sc.next();

            switch (cmd) {
                case "push":
                    int param = sc.nextInt();
                    stk.push(param);
                    break;
                case "pop":
                    if (stk.isEmpty()) {
                        System.out.println("-1");
                    } else {
                        int ret = stk.pop();
                        System.out.println(ret);
                    }
                    break;
                case "size":
                    System.out.println(stk.size());
                    break;
                case "empty":
                    if (stk.isEmpty()) {
                        System.out.println(1);
                    } else {
                        System.out.println(0);
                    }
                    break;
                case "top":
                    if (stk.isEmpty()) {
                        System.out.println("-1");
                    } else {
                        System.out.println(stk.peek());
                    }
                    break;
                default:
                    break;
            }
        }
        sc.close();
    }
}
        
        // 입력값이 모두 처리되었으므로 프로그램 종료
        
