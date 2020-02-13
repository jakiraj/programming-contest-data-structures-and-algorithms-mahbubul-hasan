package loop;

public class Pyramid6 {

	public static void main(String[] args) {
		String a[][] = new String[5][5];
		a[0][0] = ".";
		a[0][1] = ".";
		a[0][2] = "1";
		a[0][3] = ".";
		a[0][4] = ".";
		a[1][0] = ".";
		a[1][1] = "1";
		a[1][2] = "2";
		a[1][3] = "1";
		a[1][4] = ".";
		a[2][0] = "1";
		a[2][1] = "2";
		a[2][2] = "3";
		a[2][3] = "2";
		a[2][4] = "1";
		a[3][0] = ".";
		a[3][1] = "1";
		a[3][2] = "2";
		a[3][3] = "1";
		a[3][4] = ".";
		a[4][0] = ".";
		a[4][1] = ".";
		a[4][2] = "1";
		a[4][3] = ".";
		a[4][4] = ".";
		for (int row = 0; row < 5; row++) {
			for (int column = 0; column < 5; column++) {
				System.out.print(" " + a[row][column]);
			}
			System.out.println();
		}
	}

}
