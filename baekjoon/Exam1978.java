package baekjoon;

import java.util.Scanner;

public class Exam1978 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = 0;
		int a = 0;
		int cnt = 0;

		N = sc.nextInt();

		while (N-- > 0) {
			a = sc.nextInt();
			boolean flag = sosu(a);
			if (flag == true) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}

	public static boolean sosu(int a) {
		if (a <= 1) {
			return false;
		} else if (a == 2) {
			return true;
		}
		for (int i = 2; i * i <= a; i++) {
			if (a % i == 0) {
				return false;
			}
		}
		return true;
	}
}
