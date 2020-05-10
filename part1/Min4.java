package part1;

import java.util.Scanner;

public class Min4 {
	 static int min4(int a, int b, int c, int d) {
	      int min = a;         
	      if (b < min) min = b;
	      if (c < min) min = c;
	      if (d < min) min = d;

	      return min;
	   }

		
		public static void main(String[] args) {
		    Scanner scan =new Scanner(System.in);  
			int a,b,c,d;
		    a = scan.nextInt();
		    b = scan.nextInt();
		    c = scan.nextInt();
		    d = scan.nextInt();
			int min = min4(a,b,c,d);
			System.out.println(min);
		   }
}
