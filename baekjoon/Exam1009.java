package baekjoon;


import java.util.Scanner;

public class Exam1009 {
	static int T, a, b;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		T = sc.nextInt();

		while (T > 0) {
			a = sc.nextInt();
			b = sc.nextInt();
			int result = 1;

			for (int i = 0; i < b; i++) {
				result = (result * a) % 10;
			}

			if (result == 0) {
				result = 10;
			}
			System.out.println(result);
			T--;
		}

	}
}
