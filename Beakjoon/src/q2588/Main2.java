package q2588;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
String num1 = sc.next();
String num2 = sc.next();
sc.close();

int inum1 = Integer.parseInt(num1);

int inum2 = num2.charAt(2) - '0';
System.out.println(inum1 * inum2);

inum2 = num2.charAt(1) - '0';
System.out.println(inum1 * inum2);

inum2 = num2.charAt(0) - '0';
System.out.println(inum1 * inum2);

}
}