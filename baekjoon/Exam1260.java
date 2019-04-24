package baekjoon;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Exam1260 {

	static int N, M, V; // ������ ����, ������ ����, ���� ����
	static boolean[][] map;
	static boolean[] visit;
	static Queue<Integer> queue = new LinkedList<Integer>();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		V = sc.nextInt();

		visit = new boolean[N + 1]; // default : false
		map = new boolean[N + 1][N + 1]; //N+1 : 0123.. X, 1234�� �Ұ�

		//map�ʱ�ȭ
		for (int i = 0; i < M; i++) {
			int v1 = sc.nextInt();
			int v2 = sc.nextInt();
			map[v1][v2] = map[v2][v1] = true;
		}
		
		dfs(V);
		Arrays.fill(visit, false); //�ٽ� �ʱ�ȭ
		
		System.out.println();
		bfs(V);
	}

	// ���� ��ġ���� dfs�Ұ�
	static void dfs(int start) {
		if (visit[start] == true) {
			return;
		}
		System.out.print(start + " ");
		visit[start] = true;

		for (int i = 1; i <= N; i++) {
			//������ ���� �ִ� �͵� ����Լ��� �̿��� dfs���
			if (map[start][i] == true) { 
				dfs(i);
			}
		}
	}
	
	// ���� ��ġ���� bfs
	static void bfs(int start) {
		if(visit[start] == true) {
			return;
		}
		System.out.print(start+" ");
		visit[start] = true;

		for(int i=1; i<= N; i++) {
			if(map[start][i] == true) {
				queue.add(i);
			}
		}
		//ť�� ��� ���� ������ ���� ���� �ϳ� ������  bfs�ٽ� ����Լ� ������
		while(!queue.isEmpty()) {
			int next = queue.poll();
			bfs(next);
		}
	}
	
}
