package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Exam1026 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int sum = 0;

		int a[] = new int[T];
		int b[] = new int[T];

		for (int i = 0; i < T; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < T; i++) {
			b[i] = sc.nextInt();
		}

		Arrays.sort(a); // 1,2,3..
		Arrays.sort(b);

		for (int i = 0; i < T; i++) {
			sum += a[i] * b[T - i - 1];
		}

		System.out.println(sum);
	}
}
