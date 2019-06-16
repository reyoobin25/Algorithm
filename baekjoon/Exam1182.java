package baekjoon;

import java.util.Scanner;

public class Exam1182 {
	static int N = 0, S = 0, cnt = 0;
	static int a[];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		S = sc.nextInt();
		a = new int[N];

		for (int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
		}

		cnt = solve(a, S, 0, 0);
		if (S == 0) {
			cnt -= 1;
		}
		System.out.println(cnt);
	}

	public static int solve(int[] a, int S, int index, int sum) {
		if (index == a.length) {
			if (sum == S) {
				return 1;
			} else {
				return 0;
			}
		}

		return solve(a, S, index + 1, sum + a[index]) + solve(a, S, index + 1, sum);
	}
}
