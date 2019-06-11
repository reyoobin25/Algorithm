package baekjoon;

import java.util.Scanner;

public class Exam10973 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int a[] = new int[N];

		for (int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
		}
		if (permu(a)) {
			for (int i = 0; i < N; i++) {
				System.out.print(a[i] + " ");
			}
		} else {
			System.out.println("-1");
		}
	}

	public static boolean permu(int[] a) {
		int i = a.length - 1;
		while (i > 0 && a[i - 1] <= a[i]) {
			i -= 1;
		}
		if (i <= 0) {
			return false;
		}
		int j = a.length - 1;
		while (a[j] >= a[i - 1]) {
			j -= 1;
		}
		int temp = a[i - 1];
		a[i - 1] = a[j];
		a[j] = temp;

		j = a.length - 1;
		while (i < j) {
			temp = a[i];
			a[i] = a[j];
			a[j] = temp;

			i += 1;
			j -= 1;
		}
		return true;

	}

}
