package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Exam10809 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		char[] words = word.toCharArray();

		int a[] = new int[26];

		Arrays.fill(a, -1);

		for (int i = 0; i < words.length; i++) {
			int n = words[i] - 'a';
			if(a[n] != -1) { //먼저 있는지 확인부터!
				continue;
			}
			a[n] = i; //이부분도!
		}

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}

	}
}
