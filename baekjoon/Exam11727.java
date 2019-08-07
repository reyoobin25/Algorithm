package baekjoon;

import java.util.Scanner;

public class Exam11727 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[10001];

		for (int i = 0; i <= n; i++) {
			if (i <= 1) {
				arr[i] = 1;
			} else {
				arr[i] = arr[i - 1] + 2 * arr[i - 2];
				arr[i] %= 10007;
			}
		}
		System.out.println(arr[n]);
	}
}
