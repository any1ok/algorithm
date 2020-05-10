package part1;

import java.util.Scanner;

public class Min3 {

	 static int min3(int a, int b, int c) {
		int min = a;         			
		if (b < min) min = b;
		if (c < min) min = c;

			 return min;
}

	
	public static void main(String[] args) {
	    Scanner scan =new Scanner(System.in);  
		int a,b,c;
	    a = scan.nextInt();
	    b = scan.nextInt();
	    c = scan.nextInt();
		int min = min3(a,b,c);
		System.out.println(min);
	   }
}
