package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Exam11724 {
	static int N, M; // ����, ����
	static int map[][];
	static boolean visit[];
	static int x, y;
	static int cnt = 0;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();

		map = new int[N + 1][N + 1];
		visit = new boolean[N + 1];

		Arrays.fill(visit, false);

		for (int i = 0; i < M; i++) {
			x = sc.nextInt();
			y = sc.nextInt();
			map[x][y] = map[y][x] = 1;
		}

		for (int i = 1; i <= N; i++) {
			if (!visit[i]) {
				cnt++;
				travling(i);
			}
		}
		System.out.println(cnt);
	}

	static void travling(int start) {

		if (visit[start]) {
			return;
		}
		visit[start] = true;

		for (int i = 1; i <= N; i++) {
			if (map[start][i] == 1 && visit[start]) {
				travling(i);
			}
		}
	}
}
