package baekjoon;

import java.awt.Point;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exam1012 {

	static int T, M, N, K; // �׽�Ʈ, ����, ����, ���� ����
	static int[][] cabagge;
	static boolean[][] visit;
	static int bug = 0;
	static Queue<Point> queue = new LinkedList<>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		T = sc.nextInt();

		for (int i = 0; i < T; i++) {
			M = sc.nextInt();
			N = sc.nextInt();
			K = sc.nextInt();
			cabagge = new int[M][N];
			visit = new boolean[M][N];

			for (int j = 0; j < K; j++) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				cabagge[x][y] = 1;
			}
			// traveling
			for (int k = 0; k < M; k++) {
				for (int j = 0; j < N; j++) {
					if (cabagge[k][j] == 1 && !visit[k][j]) {
						traveling(k, j);
						System.out.println("k: "+k+" j: "+j);
						bug++;
					}
				}
			}
			System.out.println(bug);
			bug = 0;
		}

	}

	static void traveling(int x, int y) {
		if (visit[x][y]) {
			return;
		}
		visit[x][y] = true;

		// ��
		if (x - 1 >= 0 && cabagge[x - 1][y] == 1 && visit[x - 1][y] == false) {
			queue.add(new Point(x - 1, y));
		}

		// �Ʒ�
		if (x + 1 < M && cabagge[x + 1][y] == 1 && visit[x + 1][y] == false) {
			queue.add(new Point(x + 1, y));
		}

		// ��
		if (y + 1 < N && cabagge[x][y + 1] == 1 && visit[x][y + 1] == false) {
			queue.add(new Point(x, y + 1));
		}

		// ��
		if (y - 1 >= 0 && cabagge[x][y - 1] == 1 && visit[x][y - 1] == false) {
			queue.add(new Point(x, y - 1));
		}

		while (!queue.isEmpty()) {
			Point p = queue.poll();
				
			traveling(p.x, p.y);
		}
	}
}
