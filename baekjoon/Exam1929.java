package baekjoon;

import java.util.Scanner;

//에라토스테네스의 체
public class Exam1929 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();

		boolean ck[] = new boolean[N + 1];

		ck[0] = true;
		ck[1] = true;
		
		for (int i = 2; i <= N; i++) {
			if (ck[i] == true) {
				continue;
			}
			for (int j = i + i; j <= N; j += i) {
				ck[j] = true;
			}
		}
		for (int i = M; i <= N; i++) {
			if (ck[i] == false) {
				System.out.println(i);
			}
		}
	}
}
