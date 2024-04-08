package q10828re;

import java.util.Scanner;
//import java.util.Stack;

class SJStack {
	int[] ar;
	int top;

	public SJStack() {
		ar = new int[100];
		top = -1;
	}

	public void push(int param) {
		ar[++top] = param;
	}

	public int size() {
		return top + 1;
	}

	public int pop() {
		return ar[top--];
	}

	public void empty() {
		if (top == -1) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	}

	public void top() {
		if (top == -1) {
			System.out.println(-1);
		} else {
			System.out.println(ar[top]);
		}
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		Stack<Integer> stk = new Stack<Integer>();
		SJStack stk = new SJStack();

		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			String cmd = sc.next();

			switch (cmd) {
			case "push":
				int param = sc.nextInt();
				stk.push(param);
				break;
			case "pop":
				if (stk.size() == 0) {
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
				if (stk.size() == 0) {
					System.out.println(1);
				} else {
					System.out.println(0);
				}
				break;
			case "top":
				if (stk.size() == 0) {
					System.out.println(-1);
				} else {
					stk.top();
				}
				break;
			}
		}
		sc.close();
	}
}