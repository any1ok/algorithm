package part1;

import java.util.Scanner;

public class Pra10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a =scan.nextInt();
		int b;
		do {
			b= scan.nextInt();
			
		}while(a>=b);
		System.out.println(b-a);

	}

}
