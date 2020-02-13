package loop;

import java.util.Scanner;

public class SummationtoN3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n = sc.nextInt(), sum = 0;
		for (int i = 1; i <= n; i++) {
			sum = sum + Math.pow(i, i);
		}
		System.out.println(sum);
		sc.close();

	}

}
