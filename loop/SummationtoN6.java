package loop;

import java.util.Scanner;

public class SummationtoN6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), c = 0, r = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				int s = 1;
				for (int k = 1; k <= j; k++) {
					c++;
					s = s * c;
				}
				r = r + s;
			}
		}
		System.out.println(r);
		sc.close();
	}
}
