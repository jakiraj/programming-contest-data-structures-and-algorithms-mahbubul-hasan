package array_string;

import java.util.Scanner;

public class CountCapitalAndSmallLetter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int capitalLetter = 0, smallLetter = 0;
		String s = sc.nextLine();
		for (int i = 0; i < s.length(); i++) {
			if (Character.isUpperCase(s.charAt(i))) {
				capitalLetter++;
			}
			if (Character.isLowerCase(s.charAt(i))) {
				smallLetter++;
			}
		}
		System.out.println("Capital letter: " + capitalLetter);
		System.out.println("Small letter: " + smallLetter);
		sc.close();
	}
}
