package array_string;

import java.util.Scanner;

public class StringLength {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char ch[] = s.toCharArray();
		int i =0;
		for (char c: ch) {
			i++;
		}
		System.out.println("String length using library function: " + s.length());
		System.out.println("String length without using library function: " + i);
		
		sc.close();
	}

}
