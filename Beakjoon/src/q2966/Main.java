package q2966;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		sc.nextLine();
		String quiz = sc.nextLine();

		sc.close();

		char[] adrian = { 'A', 'B', 'C' };
		char[] bruno = { 'B', 'A', 'B', 'C' };
		char[] goran = { 'C', 'C', 'A', 'A', 'B', 'B' };

		int adrianScore = 0;
		int brunoScore = 0;
		int goranScore = 0;

		for (int i = 0; i < cnt; i++) {
			char answer = quiz.charAt(i);

			if (answer == adrian[i % adrian.length]) {
				adrianScore++;
			}
			if (answer == bruno[i % bruno.length]) {
				brunoScore++;
			}
			if (answer == goran[i % goran.length]) {
				goranScore++;
			}
		}

		if (adrianScore > brunoScore && adrianScore > goranScore) {
			System.out.println(adrianScore);
			System.out.println("Adrian");
		} else if (brunoScore > adrianScore && brunoScore > goranScore) {
			System.out.println(brunoScore);
			System.out.println("Bruno");
		} else if (goranScore > adrianScore && goranScore > brunoScore) {
			System.out.println(goranScore);
			System.out.println("Goran");
		} else if (adrianScore > goranScore && brunoScore > goranScore && adrianScore == brunoScore) {
			System.out.println(adrianScore);
			System.out.println("Adrian");
			System.out.println("Bruno");
		} else if (adrianScore > brunoScore && goranScore > brunoScore && adrianScore == goranScore) {
			System.out.println(adrianScore);
			System.out.println("Adrian");
			System.out.println("Goran");
		} else if (brunoScore > adrianScore && goranScore > adrianScore && brunoScore == goranScore) {
			System.out.println(brunoScore);
			System.out.println("Bruno");
			System.out.println("Goran");
		} else if (adrianScore==brunoScore&&adrianScore==goranScore) {
			System.out.println(adrianScore);
			System.out.println("Adrian");
			System.out.println("Bruno");
			System.out.println("Goran");
		}
	}

}
