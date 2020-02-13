package loop;

import java.util.Scanner;

public class SummationtoN7 {
	static double sum(int n) {
		double sum = 0;
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact *= i;
			sum += 1.0/fact;
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(sum(n));
		sc.close();
	}
}