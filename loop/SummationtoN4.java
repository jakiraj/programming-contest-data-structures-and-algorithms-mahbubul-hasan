package loop;

import java.util.Scanner;

public class SummationtoN4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(series(1, 1, n));
		sc.close();
	}
	
	static int series(int a, int b, int n) {
		int i, c = 0;
		if (b == n + 1)
			return 0;
		for (i = a; i < a + b; i++)
			c += i;
		return c + series(i, b + 1, n);
	}

	

}
