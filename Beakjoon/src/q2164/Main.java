package q2164;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Deque<Integer> q = new ArrayDeque<>();
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			q.add(i);
		}

		while (true) {
			if (q.size() == 1) {
				System.out.println(q.getFirst());
				break;
			}

			q.remove();
			int a = (int) q.poll();
			q.addLast(a);
		}

	}

}
