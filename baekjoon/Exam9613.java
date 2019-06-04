package baekjoon;

import java.util.Scanner;

public class Exam9613 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = 0;
		int n = 0;
		long result = 0L;

		T = sc.nextInt();

		while (T-- > 0) {
			n = sc.nextInt();
			
			int a[] = new int[n];

			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}

			for (int i = 0; i < n - 1; i++) {
				for (int j = i + 1; j < n; j++) {
					result += gcd(a[i], a[j]);
				}
			}
			System.out.println(result);
			result = 0;
		}

	}

	private static int gcd(int a, int b) {
		if (b == 0) {
			return a;
		}

		return gcd(b, a % b);
	}

}
