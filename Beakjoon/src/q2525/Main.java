package q2525;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int M = sc.nextInt();
		int setTime = sc.nextInt();
		sc.close();
		int resultM = M + setTime;

		if (resultM >= 60) {
			H++;
			resultM = M + setTime - 60;
			if (resultM == 60) {
				H++;
				resultM = 0;
				
				
			}
			if (H == 24) {
				H = 0;
			}
		}
		System.out.println(H + " " + resultM);
	}
}

/*
 * KOI ���ڿ����� �ǰ��� ���� ���ִ� ������������ �丮�� �����ϰ� ����� �ΰ����� ������ �����Ϸ��� �Ѵ�. �ΰ����� ������ ����ϴ� �����
 * ������ ���� ���� ���� ��Ḧ �ΰ����� ���쿡 ������ �ȴ�. �׷��� �ΰ����� ������ ���챸�̰� ������ �ð��� �� ������ �ڵ�������
 * ����Ѵ�.
 * 
 * ����, KOI ������ �ΰ����� ���� �ո鿡�� ����ڿ��� ������������ �丮�� ������ �ð��� �˷� �ִ� ������ �ð谡 �ִ�.
 * 
 * �����������̸� �����ϴ� �ð��� ���챸�̸� �ϴ� �� �ʿ��� �ð��� �д����� �־����� ��, ���챸�̰� ������ �ð��� ����ϴ� ���α׷���
 * �ۼ��Ͻÿ�.
 */