package q28279;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        Deque<Integer> dq = new ArrayDeque<>();
        
        for (int i = 0; i < tc; i++) {
            String[] input = br.readLine().split(" ");
            int inp = Integer.parseInt(input[0]);
            
            switch (inp) {
                case 1:
                    dq.addFirst(Integer.parseInt(input[1]));
                    break;
                case 2:
                    dq.addLast(Integer.parseInt(input[1]));
                    break;
                case 3:
                    if (dq.isEmpty()) {
                        System.out.println("-1");
                    } else {
                        System.out.println(dq.pollFirst());
                    }
                    break;
                case 4:
                    if (dq.isEmpty()) {
                        System.out.println("-1");
                    } else {
                        System.out.println(dq.pollLast());
                    }
                    break;
                case 5:
                    System.out.println(dq.size());
                    break;
                case 6:
                    if (dq.isEmpty()) {
                        System.out.println("1");
                    } else {
                        System.out.println("0");
                    }
                    break;
                case 7:
                    if (dq.isEmpty()) {
                        System.out.println("-1");
                    } else {
                        System.out.println(dq.peekFirst());
                    }
                    break;
                case 8:
                    if (dq.isEmpty()) {
                        System.out.println("-1");
                    } else {
                        System.out.println(dq.peekLast());
                    }
                    break;
            }
        }
        
        br.close();
    }
}
