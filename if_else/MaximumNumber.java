package if_else;

import java.util.Scanner;

public class MaximumNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
		if (a > b && a > c) {
			System.out.println(a + " is the maximum number");
		}else if (b > c && b > a) {
			System.out.println(b + " is the maximum number");
		}else {
			System.out.println(c + " is the maximum number");
		}
		sc.close();
	}

}
