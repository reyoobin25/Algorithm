package baekjoon;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Exam11650 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		Point[] points = new Point[T];
		for (int i = 0; i < T; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();

			Point p = new Point(x, y);

			points[i] = p;
		}

		Arrays.sort(points, new Comparator<Point>() {

			@Override
			public int compare(Point o1, Point o2) {
				int result = o1.x - o2.x;
				if (result == 0) {
					return o1.y - o2.y;
				}else
					return result;
			}
		});

		for (int i = 0; i < T; i++) {
			System.out.println(points[i].x + " " + points[i].y);
		}

	}
}
