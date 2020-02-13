package loop;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), count = 0;
		for (int i = 2; i < n ; i++) {
			if (n % i == 0) {
				count++;
				break;
			}
		}
		if (count == 0) {
			System.out.println(n + " is a prime number.");
		}else {
			System.out.println(n + " is not a prime number.");
		}
		sc.close();

	}

}
