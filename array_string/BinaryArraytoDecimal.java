package array_string;

import java.util.Scanner;

public class BinaryArraytoDecimal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = { 1, 0, 1, 0 };
		int i;
		int output = 0, power = 1;
		for (i = 0; i < arr.length; i++) {
			output += arr[3 - i] * power;
			power *= 2;
		}
		System.out.println(output);
		sc.close();
	}
}
