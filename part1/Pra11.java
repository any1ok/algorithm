package part1;

import java.util.Scanner;

public class Pra11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n;
		do {
		n = scan.nextInt();
		} while (n <= 0);

		int i = 1; 			// 자릿수
		while (n > 10) {
			n /= 10; 			// n을 10으로 나눔
			i++;
		}

		System.out.println(i);
}
}