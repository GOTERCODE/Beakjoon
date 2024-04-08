package q10828;

import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> stk = new Stack<Integer>();

		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			String cmd = sc.next();

			switch (cmd) {
			case "push":
				int param = sc.nextInt();
				stk.push(param);
				break;
			case "pop":
				if (stk.empty()) {
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
				if (stk.empty()) {
					System.out.println(1);
				} else {
					System.out.println(0);
				}
				break;
			case "top":
				if (stk.empty()) {
					System.out.println(-1);
				} else {
					System.out.println(stk.peek());
				}
				break;
			}
		}
		sc.close();
	}
}

/*
 * ������ �����ϴ� ������ ������ ����, �Է����� �־����� ����� ó���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * 
 * ����� �� �ټ� �����̴�.
 * 
 * push X: ���� X�� ���ÿ� �ִ� �����̴�. pop: ���ÿ��� ���� ���� �ִ� ������ ����, �� ���� ����Ѵ�. ���� ���ÿ� ����ִ�
 * ������ ���� ��쿡�� -1�� ����Ѵ�. size: ���ÿ� ����ִ� ������ ������ ����Ѵ�. empty: ������ ��������� 1, �ƴϸ� 0��
 * ����Ѵ�. top: ������ ���� ���� �ִ� ������ ����Ѵ�. ���� ���ÿ� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
 * 
 * 
 * �Է� ù° �ٿ� �־����� ����� �� N (1 �� N �� 10,000)�� �־�����. ��° �ٺ��� N���� �ٿ��� ����� �ϳ��� �־�����.
 * �־����� ������ 1���� ũ�ų� ����, 100,000���� �۰ų� ����. ������ �������� ���� ����� �־����� ���� ����.
 * 
 * ��� ����ؾ��ϴ� ����� �־��� ������, �� �ٿ� �ϳ��� ����Ѵ�.
 */

/*
 * 1. �ڹٿ��� �����ϴ� Stack Ŭ������ �̿��� Ǯ�� 2. ���� �����ϴ� Stack Ŭ������ �̿��� Ǯ��
 */
