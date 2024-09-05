package q11866;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		LinkedList<Integer> q = new LinkedList<>();

		for (int i = 1; i <= n; i++) {
			q.add(i);
		}
		int cnt = k - 1;
		int mcnt = 0;
		while (true) {
			int idx = cnt - mcnt;
			if (q.isEmpty()) {
				break;
			}
			if(idx<0) {
				idx += (cnt+mcnt)-1;
			}
			System.out.println(q.remove(idx));
			mcnt++;
			for (int i = 1; i <= k; i++) {
				cnt++;
				
			}
			if (cnt >= q.size()) {
				cnt = cnt - q.size();
				
			}

		}

	}

}
