package q1546;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int cnt = sc.nextInt();
		double score[ ]= new double[cnt];
		double res = 0;
		for(int i=0;i<cnt;i++) {
			score[i]=sc.nextInt();
		}
		sc.close();
		double max = Arrays.stream(score).max().getAsDouble();
		for(int i = 0; i<cnt;i++) {
			res = res+score[i]/max*100;
		}
		System.out.printf("%.6f",res/cnt);
	}

}
