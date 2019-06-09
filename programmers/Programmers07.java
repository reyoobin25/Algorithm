package programmers;

//124나라의 숫자
public class Programmers07 {
	public static void main(String[] args) {
		int n = 6;
		System.out.println(solution(n));

	}

	public static String solution(int n) {
		String answer = "";
		int arr[] = { 4, 1, 2 };

		while (n > 0) {
			int a = n % 3;
			n = n / 3;

			if (a == 0) {
				n -= 1;
			}

			answer = arr[a] + answer;
		}

		return answer;
	}
}
