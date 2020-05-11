package part2;

import java.util.Scanner;

public class Pra2 {

	static void swap(int[] a,int idx1,int idx2) {
		int t = a[idx1];
		a[idx1]=a[idx2];
		a[idx2] = t;
	}
	static void reverse(int[] a) {
		for(int i=0;i<a.length/2;i++) {
			swap(a,i,a.length-i-1);
			for(int j=0;j<a.length;j++) {
				System.out.print(a[j]);
				System.out.print(" ");
			}
			System.out.print("\n");
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = scan.nextInt();
		}
		reverse(a);
	}

}
