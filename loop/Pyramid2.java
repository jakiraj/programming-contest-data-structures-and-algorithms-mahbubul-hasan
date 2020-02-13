package loop;


public class Pyramid2 {

	public static void main(String[] args) {
		String arr [][] = new String [3][3];
		arr[0][0] = "*";
		arr[0][1] = "*";
		arr[0][2] = "*";
		arr[1][0] = ".";
		arr[1][1] = "*";
		arr[1][2] = "*";
		arr[2][0] = ".";
		arr[2][1] = ".";
		arr[2][2] = "*";
		for (int row = 0; row < 3; row++) {
			for (int column = 0; column < 3; column++) {
				System.out.print(" " + arr[row][column]);
			}
			System.out.println();
		}
	}
}
