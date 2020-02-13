package if_else;

import java.util.Scanner;

public class CoOrdinate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double distance, x1 = sc.nextInt(), y1 = sc.nextInt(), x2 = sc.nextInt(), y2 = sc.nextInt();
		distance = Math.sqrt(Math.pow(x2 - x1, 2)+ Math.pow(y2 - y1, 2));
		System.out.println(distance);
		sc.close();
	}
}
