package part5;

import java.util.Scanner;

public class Pra2 {
	public static int gcd(int a,int b) {
		
		
		while(a%b !=0) {
			int k=b;
			b = a%b;
			a = k;
		}
		return b;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.println(gcd(a,b));
		
	}

}
