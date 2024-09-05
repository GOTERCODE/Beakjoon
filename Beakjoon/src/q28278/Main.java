package q28278;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws Exception, IOException {

		Stack<String> stack = new Stack<>();

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int tc = Integer.parseInt(bf.readLine());

		for (int i = 0; i < tc; i++) {

			String inp = bf.readLine();
			String array[] = inp.split(" ");
			if (array[0].equals("1")) {

				stack.push(array[1]);
			} else if (inp.equals("2")) {
				if (stack.empty()) {
					System.out.println("-1");
				} else {
					System.out.println(stack.pop());
				}
			}

			else if (inp.equals("3")) {
				System.out.println(stack.size());
			}

			else if (inp.equals("4")) {
				if (stack.empty()) {
					System.out.println("1");
				} else {
					System.out.println("0");
				}
			}

			else if (inp.equals("5")) {
				if (stack.empty()) {
					System.out.println("-1");
				} else {
					System.out.println(stack.peek());
				}
			}

		}
		bf.close();

	}

}
