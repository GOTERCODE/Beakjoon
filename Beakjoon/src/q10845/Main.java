package q10845;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Deque<Integer> q = new ArrayDeque<>();

		int tc = Integer.parseInt(br.readLine());

		for (int i = 0; i < tc; i++) {
			String st = br.readLine();
			String[] inp = st.split(" ");
			if (inp[0].equals("push")) {
				q.add(Integer.parseInt(inp[1]));
			} else if (inp[0].equals("pop")) {

				if (q.isEmpty()) {
					System.out.println("-1");
				} else {
					System.out.println(q.poll());
				}
			} else if (inp[0].equals("size")) {
				System.out.println(q.size());
			} else if (inp[0].equals("empty")) {
				if (q.isEmpty()) {
					System.out.println("1");
				} else {
					System.out.println("0");
				}
			} else if (inp[0].equals("front")) {
				if (q.isEmpty()) {
					System.out.println("-1");
				} else {
					System.out.println(q.peekFirst());
				}
			} else if (inp[0].equals("back")) {
				if (q.isEmpty()) {
					System.out.println("-1");
				} else {
					System.out.println(q.peekLast());
				}
			}

		}
		
		br.close();

	}

}
