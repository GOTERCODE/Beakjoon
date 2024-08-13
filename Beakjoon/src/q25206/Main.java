package q25206;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double[] score = new double[20];

		double[] gradeD = new double[20];
		double scoresum = 0;
		double sum = 0;

		for (int i = 0; i < 20; i++) {
			String sub = sc.next();
			score[i] = sc.nextDouble();
			
			String grade = sc.next();
			if (grade.equals("A+")) {
				gradeD[i] = 4.5;
			} else if (grade.equals("A0")) {
				gradeD[i] = 4.0;
			} else if (grade.equals("B+")) {
				gradeD[i] = 3.5;
			} else if (grade.equals("B0")) {
				gradeD[i] = 3.0;
			} else if (grade.equals("C+")) {
				gradeD[i] = 2.5;
			} else if (grade.equals("C0")) {
				gradeD[i] = 2.0;
			} else if (grade.equals("D+")) {
				gradeD[i] = 1.5;
			} else if (grade.equals("D0")) {
				gradeD[i] = 1.0;
			} else if (grade.equals("F")) {
				gradeD[i] = 0.0;
			} else if (grade.equals("P")) {
				score[i] = 0.0;
				gradeD[i] = 0.0;
			}
			scoresum += score[i];
			sum += (score[i] * gradeD[i]);

		}
		sc.close();
		
		double result = sum / scoresum;

		System.out.printf("%6f",result);

	}

}
