package array_string;

import java.util.Scanner;

public class StringContains {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Write a word: ");
		String a = sc.next();
		System.out.print("Write a word: ");
		String b = sc.next();
		System.out.println(b +" in " + a + ":"+ a.contains(b));
		sc.close();
	}
}
