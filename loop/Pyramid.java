package loop;

import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int column = sc.nextInt();
		String arr [][] = new String [row][column];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column ; j++) {
				arr [i][j] = sc.next();
				System.out.print(" ");
			}
		}
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column ; j++) {
				System.out.print(arr [i][j] +" ");
			}
			System.out.println();
		}
		sc.close();
	}
}
