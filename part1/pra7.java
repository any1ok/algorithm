package part1;

import java.util.Scanner;

public class pra7 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.print("n의 값：");
		int n = scan.nextInt();

		int sum = 0; 		// 합
		int i = 1;

		while (i <= n) { 	// i가 n 이하면 반복
			sum += i; 		// sum에 i를 더함
			i++; 			// i의 값을 1 증가(increment)
		}
		System.out.println(sum);

	}
}
