package programmers;

//level2-N°³ÀÇ LCM ok
public class Programmers05 {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3 };
		System.out.println(solution(a));
	}

	public static int solution(int[] arr) {
		int answer = 0;

		for (int i = 0; i < arr.length - 1; i++) {
			arr[i + 1] = (arr[i] * arr[i + 1]) / gcd(arr[i], arr[i + 1]);
			answer = arr[arr.length - 1];
		}

		return answer;
	}

	public static int gcd(int a, int b) {
		if (b == 0) {
			return a;
		} else {
			return gcd(b, a % b);
		}
	}
}
