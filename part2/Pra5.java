package part2;

import java.util.Scanner;

public class Pra5 {
	static void copy(int[] a,int[] b) {
		for(int i=0;i<a.length;i++) {
			b[i] =a[i];
		}
	}
	static void swap(int[] a,int idx1,int idx2) {
		int t = a[idx1];
		a[idx1]=a[idx2];
		a[idx2] = t;
	}
	static void reverse(int[] a) {
		for(int i=0;i<a.length/2;i++) {
			swap(a,i,a.length-i-1);
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
		reverse(a);
		copy(a,b);
		for(int i=0;i<n;i++) {
			System.out.print(b[i]);
			System.out.print(" ");
		}

	}

}
