package part5;

import java.util.Scanner;

public class Pra1 {

	public static int factorial(int n) {
		int i=0;
		int f=1;
		while(n !=1) {
			f *= n--;
		}
		return f;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		System.out.println(factorial(n));
		
	}

}
