package part1;

import java.util.Scanner;

public class pra8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a,b;
		a = scan.nextInt();
		b = scan.nextInt();
		int an;
		int n = b-a+1;
		if(n%2 ==1) {
			n = n/2;
			an = (a+b)*n+(a+b)/2;
			
		}
		else {
			n = n/2;
			an = (a+b)*n;
		}
		System.out.println(an);
		
		
	}

}
