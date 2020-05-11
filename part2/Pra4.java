package part2;

import java.util.Scanner;

public class Pra4 {
	static void copy(int[] a,int[] b) {
		for(int i=0;i<a.length;i++) {
			b[i] =a[i];
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a[] = new int[n];
		int b[] = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = scan.nextInt();
		}
		copy(a,b);
		for(int i=0;i<n;i++) {
			System.out.print(b[i]);
			System.out.print(" ");
		}
		
	}

}
