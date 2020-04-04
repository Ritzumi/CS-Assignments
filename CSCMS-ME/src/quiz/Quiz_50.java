package quiz;

import java.util.Scanner;

public class Quiz_50 {

	static double function(double in, double c1, double c2) {
		return c1 + c2 * (in - Math.sin(in));
	}

	static double tolerance(double a, double b) {
		return (b - a) / 2;
	}

	static double findX(double a, double b) {
		return (a + b) / 2;
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble(), b = sc.nextDouble(), c1 = sc.nextDouble(), c2 = sc.nextDouble(),
				tol = sc.nextDouble();
		if (function(a, c1, c2) * function(b, c1, c2) >= 0) {
			return;
		}
		while (tolerance(a, b) > tol) {
			if (function(a, c1, c2) * function(findX(a, b), c1, c2) < 0) {
				b = findX(a, b);
			} else {
				a = findX(a, b);
			}
		}
		System.out.printf("%.6f", findX(a, b));

	}

}
