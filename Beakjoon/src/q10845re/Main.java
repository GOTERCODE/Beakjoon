package q10845re;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<Integer>();
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for(int i=0;i<N;i++) {
			String cmd = sc.next();
			System.out.println(cmd);
			
			switch(cmd) {
			case "push" :
				int v = sc.nextInt();
				queue.offer(v);
				break;
				
			case "pop" :
				if(queue.isEmpty()) {
					System.out.println("-1");
				}else {
				queue.poll();	//제일 앞에있는 값을 조회하고 제거
				}
				break;
				
			case "size" :
				int size = queue.size();
				System.out.println(size);
				break;
				
			case "empty" :
				if(queue.isEmpty()) {
					System.out.println("1");
				}else {
					System.out.println("0");
				}
				break;
				
			case "front" :
				if(queue.isEmpty()) {
					System.out.println("-1");
				}else {
					int ret = queue.peek();
					System.out.println(ret);
				}
				break;
				
			case "back" :
				if(queue.isEmpty()) {
					System.out.println("-1");
				}else {
					int ret = queue.peek
				}
				break;
			}
		}
		sc.close();
	}

}
