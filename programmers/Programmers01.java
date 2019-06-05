package programmers;

import java.util.Scanner;

//level1 - 약수의 합 ok
public class Programmers01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		int sum = 0;
		n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
	}
}
