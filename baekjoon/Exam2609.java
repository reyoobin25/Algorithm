package baekjoon;

import java.util.Scanner;

public class Exam2609 {
	static int a, b = 0;
	static int result1, result2 = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		a = sc.nextInt();
		b = sc.nextInt();

		result1 = gcd(a, b);
		result2 = (a * b) / result1;

		System.out.println(result1);
		System.out.println(result2);
	}

	public static int gcd(int a, int b) {
		if (b == 0) {
			return a;
		}
		return gcd(b, a % b);
	}
}
