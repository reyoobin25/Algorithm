package programmers;

public class Programmers09 {
	public static void main(String[] args) {
		int N = 5;
		System.out.println(solution(N));
	}

	public static long solution(int N) {
		long answer = 0;
		long arr[] = new long[100];

		arr[0] = 4;
		arr[1] = 6;

		for (int i = 2; i <= N; i++) {
			arr[i] = arr[i - 2] + arr[i - 1];
		}

		answer = arr[N - 1];

		return answer;
	}
}
