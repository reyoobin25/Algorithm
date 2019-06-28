package baekjoon;

import java.util.Scanner;

public class Exam15649 {
	static int answer[] = new int[10];
	static boolean check[] = new boolean[10];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();

		travel(0, N, M);
	}

	public static void travel(int index, int N, int M) {
		//���� ��� �κ�
		if (index == M) {
			for (int i = 0; i < M; i++) {
				System.out.print(answer[i]);
				if (i != M - 1) {
					System.out.print(' ');
				}
			}
				System.out.println();
				return;
		}
		
		//��� üũ, ������ answer�迭�� �ֱ�
		for (int i = 1; i <= N; i++) {
			if (check[i]) {
				continue;
			}
			check[i] = true;
			answer[index] = i;

			travel(index + 1, N, M);
			check[i] = false;
		}
	}
}
