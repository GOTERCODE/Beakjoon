package q10773;

import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Stack<Integer> stack = new Stack<>();

		int tc = sc.nextInt();
		int sum = 0;
		for (int i = 0; i < tc; i++) {
			int n = sc.nextInt();

			if (n != 0) {
				stack.push(n);
			} else if (n == 0) {
				stack.pop();
			}

		}
		int stacksize = stack.size();

		for (int i = 0; i < stacksize; i++) {

			sum += stack.pop();
		}

		System.out.println(sum);
	}

}
