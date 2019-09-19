package test;

import java.util.Arrays;

public class Test1 {
	public static void main(String[] args) {
		int arr[] = {1,2,4,3,3};
		// {1,2,4,3,3}
		// {2,3,4,4,2,1,3,1}
		System.out.println(solution(arr));
	}

	public static int solution(int[] s) {
		int answer = 0;
		int start = 0;
		int end = s.length - 1;
		int sum = 0;

		Arrays.sort(s);

		while (start < end) {
			sum = s[start] + s[end];
			if (sum < 4) {
				while (--end > start) {
					sum = sum + s[end];
					if (sum > 4)
						break;
				}
				answer++;
				start++;
			} else if (sum == 4) {
				answer++;
				start++;
				end--;
			} else {
				answer++;
				end--;
			}
		}
		if (start == end) {
			answer++;
		}

		return answer;

	}
}