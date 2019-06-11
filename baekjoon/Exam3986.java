package baekjoon;

import java.util.Scanner;
import java.util.Stack;

public class Exam3986 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Character> stack = new Stack<>();

		int n = sc.nextInt();
		int cnt = 0;

		sc.nextLine();
		for (int i = 0; i < n; i++) {
			String a = sc.nextLine();
			char[] c = a.toCharArray();
			for (int j = 0; j < c.length; j++) {
				if (stack.isEmpty() || !stack.peek().equals(c[j])) {
					stack.push(c[j]);
				} else if (!stack.isEmpty() && stack.peek().equals(c[j])) {
					stack.pop();
				}
			}
			if (stack.isEmpty()) {
				cnt++;
			}
			stack.clear();
		}
		System.out.println(cnt);
	}
}
