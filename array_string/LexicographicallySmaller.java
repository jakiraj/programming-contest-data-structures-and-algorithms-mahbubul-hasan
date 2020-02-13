package array_string;

import java.util.Scanner;

public class LexicographicallySmaller {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String s1 = sc.next();
		System.out.print("Enter another string: ");
		String s2 = sc.next();
		System.out.println(s1.compareTo(s2));
		sc.close();
	}

}
