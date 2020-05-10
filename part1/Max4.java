package part1;

import java.util.Scanner;

public class Max4 {
	


		
		static int max4(int a, int b, int c, int d) {
			int max = a; 	// 최댓값
			if (b > max)
				max = b;
			if (c > max)
				max = c;
			if (d > max)
				max = d;

			return max;
		}
		
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			int a,b,c,d;
			a= scan.nextInt();
			b= scan.nextInt();
			c= scan.nextInt();
			d= scan.nextInt();
			int max = max4(a, b, c, d);
			System.out.print(max);
			
		}

	

}
