package part3;

import java.util.Scanner;

public class Pra3 {

	static int searchIdx(int[] a, int n, int key, int[] idx) {
		int count = 0;
		for (int i = 0; i < n; i++)
			if (a[i] == key)
				idx[count++] = i;
		return count;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = scan.nextInt();
		}
		int key = scan.nextInt();
		int[] idx = new int[n];
		System.out.print(searchIdx(a,a.length,key,idx));
		
	}
}
