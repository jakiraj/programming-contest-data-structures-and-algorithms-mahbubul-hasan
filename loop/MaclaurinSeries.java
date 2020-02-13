package loop;

import java.util.Scanner;

public class MaclaurinSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value for x: ");
		double x = sc.nextDouble();
		System.out.println("Enter a value for n: ");
		int numTerms = sc.nextInt();
		System.out.println("Maclaurine Series for sin: " + sinApprox(x, numTerms));
		System.out.println("Maclaurine Series for cos: " + cosApprox(x, numTerms));
		sc.close();
	}

	public static double sinApprox(double x, int numTerms) {
		double solution = 0;
		double eachTerm = 1.0;
		int termsSoFar = 0;
		for (int i = 1; i < (2 * numTerms); ++i) {
			eachTerm *= x / i;
			if (i % 2 != 0) {
				++termsSoFar;
				if (termsSoFar % 2 == 0) {
					solution -= eachTerm;
				} else {
					solution += eachTerm;
				}
			}
		}
		return solution;
	}

	public static double cosApprox(double x, int numTerms) {
		double solution = 1;
		double eachTerm = 1;
		int termsSoFar = 1;
		for (int i = 1; i < (2 * numTerms); ++i) {
			eachTerm *= x / i;
			if (i % 2 == 0) {
				++termsSoFar;
				if (termsSoFar % 2 == 0) {
					solution -= eachTerm;
				} else {
					solution += eachTerm;
				}
			}
		}
		return solution;
	}

}
