package baekjoon;

import java.util.Scanner;

public class Exam15651 {
	static int[] answer = new int[10];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();

		go(0, N, M);
	}

	public static void go(int index, int n, int m) {
		if (index == m) {
			for (int i = 0; i < m; i++) {
				System.out.print(answer[i]);
				if (i != m - 1) {
					System.out.print(' ');
				}
			}
			System.out.println();
			return;
		}

		for (int i = 1; i <= n; i++) {
			answer[index] = i;
			go(index + 1, n, m);
		}
	}
}
