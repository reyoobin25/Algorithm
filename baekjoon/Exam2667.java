package baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exam2667 {
	static int N;
	static char map[][];
	static boolean visit[][];
	static ArrayList<Integer> arr = new ArrayList<>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();

		map = new char[N][N];
		visit = new boolean[N][N];

		sc.nextLine();
		for (int i = 0; i < N; i++) {
			map[i] = sc.nextLine().toCharArray();
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (map[i][j] == 1 && !visit[i][j]) {
					arr.add(traveling(i, j));
				}
			}
		}
		System.out.println(arr.size());

		Collections.sort(arr);
		for (int a : arr) {
			System.out.println(a);
		}
	}

	static int traveling(int x, int y) {

		visit[x][y] = true;
		int cnt = 1;

		// ╩С
		if (x - 1 >= 0 && map[x - 1][y] == 1 && !visit[x - 1][y]) {
			cnt += traveling(x - 1, y);
		}
		// го
		if (x + 1 < N && map[x + 1][y] == 1 && !visit[x + 1][y]) {
			cnt += traveling(x + 1, y);
		}
		// ©Л
		if (y + 1 < N && map[x][y + 1] == 1 && !visit[x][y + 1]) {
			cnt += traveling(x, y + 1);
		}
		// аб
		if (y - 1 >= 0 && map[x][y - 1] == 1 && !visit[x][y - 1]) {
			cnt += traveling(x, y - 1);
		}

		return cnt;
	}
}
