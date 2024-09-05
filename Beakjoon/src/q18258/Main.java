package q18258;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

    public static void main(String[] args) throws IOException {

        Deque<String> dq = new ArrayDeque<>();

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int tc = Integer.parseInt(bf.readLine());

        for (int i = 0; i < tc; i++) {
            String inp = bf.readLine();
            String array[] = inp.split(" ");

            if (array[0].equals("push")) {
                dq.add(array[1]);
            } else if (inp.equals("pop")) {
                if (dq.isEmpty()) {
                    bw.write("-1\n");
                } else {
                    bw.write(dq.poll() + "\n");
                }
            } else if (inp.equals("size")) {
                bw.write(dq.size() + "\n");
            } else if (inp.equals("empty")) {
                if (dq.isEmpty()) {
                    bw.write("1\n");
                } else {
                    bw.write("0\n");
                }
            } else if (inp.equals("front")) {
                if (dq.isEmpty()) {
                    bw.write("-1\n");
                } else {
                    bw.write(dq.peek() + "\n");
                }
            } else if (inp.equals("back")) {
                if (dq.isEmpty()) {
                    bw.write("-1\n");
                } else {
                    bw.write(dq.peekLast() + "\n");
                }
            }
        }
        
        bw.flush();
        bw.close();
        bf.close();
    }
}
