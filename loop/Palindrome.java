package loop;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, b, rev = 0, limit = sc.nextInt();
		for (int i = 1; i <= limit; i++) {
			n = i;
			while (n > 0) {
				b = n % 10;
				rev = rev * 10 + b;
				n = n / 10;
			}
			if (rev == i) {
				System.out.print(i + " ");
			}
			rev = 0;
		}
		sc.close();
	}
}
