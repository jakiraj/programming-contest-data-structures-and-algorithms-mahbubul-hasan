package loop;


public class Pyramid4 {

	public static void main(String[] args) {
		String a[][] = new String[3][5];
		a[0][0] = "1";
		a[0][1] = "2";
		a[0][2] = "3";
		a[0][3] = "2";
		a[0][4] = "1";
		a[1][0] = ".";
		a[1][1] = "1";
		a[1][2] = "2";
		a[1][3] = "1";
		a[1][4] = ".";
		a[2][0] = ".";
		a[2][1] = ".";
		a[2][2] = "1";
		a[2][3] = ".";
		a[2][4] = ".";
		for (int row = 0; row < 3; row++) {
			for (int column = 0; column < 5; column++) {
				System.out.print(" " + a[row][column]);
			}
			System.out.println();
		}
	}
}
