package programmers;

import java.util.Arrays;

//전화번호 목록 - 해시
public class Exam02 {
	public static void main(String[] args) {
		String[] phone_book = {"12", "123", "1235", "567", "88"};    // "12", "123", "1235", "567", "88"
																	// "123", "456", "789" 
																	// "119", "97674223","1195524421"
		System.out.println(solution(phone_book));
	}

	public static boolean solution(String[] phone_book) {
		boolean answer = true;

		Arrays.sort(phone_book);

		for (int i = 0; i < phone_book.length - 1; i++) {
			for (int j = i + 1; j < phone_book.length; j++) {
				if (phone_book[j].contains(phone_book[i])) {
					answer = false;
					return answer;
				}
			}
		}

		return answer;
	}
}
