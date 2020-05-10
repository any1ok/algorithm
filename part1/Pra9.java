package part1;

import java.util.Scanner;

public class Pra9 {
	
	
	static int sumof(int a,int b) {
		if(a>b) {
			int k;
			k = a;
			a = b;
			b = k;
			
		}
			
		int n = b-a+1;
		if(n%2 ==1) {
			n = n/2;
			n =(a+b)*n+(a+b)/2;
			return n;
			
		}
		else {
			n = n/2;
			n= (a+b)*n;
			return n;
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a,b;
		a = scan.nextInt();
		b = scan.nextInt();
		System.out.println(sumof(a,b));

	}

}
