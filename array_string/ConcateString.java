package array_string;

import java.util.Scanner;

public class ConcateString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String a = sc.next();
		System.out.print("Enter another string: ");
		String b = sc.next();
		System.out.println("Concate String is: " + a.concat(b));
		sc.close();
	}

}
