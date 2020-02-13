package array_string;

public class RangeSum {

	public static void preCompute(int a[], int n, int p[]) {
		p[0] = a[0];
		for (int i = 1; i < n; i++) {
			p[i] = a[i] + p[i-1];
		}
	}
	
	public static int rangeSum(int i, int j, int p[]) {
		if (i == 0) {
			return p[j];
		}
		return p[j] - p[i-1];
	}
	
	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6};
		int n = a.length;
		int p[] = new int[n];
		preCompute(a, n, p);
		System.out.println(rangeSum(1, 3, p));

	}

}
