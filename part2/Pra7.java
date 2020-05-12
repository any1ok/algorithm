package part2;

import java.util.Scanner;

public class Pra7 {

	static int cardConv(int x, int r, char[] d) {
		int digits = 0;// 변환 뒤의 자릿수
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		do {
			d[digits++] = dchar.charAt(x % r); // r로 나눈 나머지를 저장
			System.out.print(x % r);
			x /= r;
		} while (x != 0);

		for (int i = 0; i < digits / 2; i++) { // d[0]~d[digits-1]
			char temp = d[i];
			d[i] = d[digits - i - 1];
			d[digits - i - 1] = temp;
		}
		return digits;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n; // 변환하는 정수
		int cd; // 기수
		int dno; // 변환 뒤의 자릿수
		int retry; // 한 번 더?
		char[] cno = new char[32]; // 변환 뒤의 각 자리를 저장하는 문자인 배열

		
		
			do {
				
				n = scan.nextInt();
			} while (n < 0);

			do {
				
				cd = scan.nextInt();
			} while (cd < 2 || cd > 36);

			dno = cardConv(n, cd, cno); // no를 cd진수로 변환

			
			for (int i = 0; i < dno; i++) // 윗자리부터 차례로 나타냄
				System.out.print(cno[i]);
			

			
	
	}

}
