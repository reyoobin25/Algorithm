package baekjoon;

import java.util.Scanner;

public class Exam1934 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = 0;
		int a, b = 0;
		int result = 0;

		T = sc.nextInt();

		while (T > 0) {
			a = sc.nextInt();
			b = sc.nextInt();

			result = (a * b) / gcd(a, b);
			System.out.println(result);
			T--;
		}
	}

	public static int gcd(int a, int b) {
		if (b == 0) {
			return a;
		}
		return gcd(b, a % b);
	}
}
