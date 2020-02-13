package array_string;

import java.util.Scanner;

public class WordCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] word = s.trim().split("\\s+");
		int wordCount = word.length;
		System.out.println("Total word: " + wordCount);
		sc.close();
	}
}
