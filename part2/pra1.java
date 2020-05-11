package part2;

import java.util.Random;
import java.util.Scanner;

public class pra1 {
	static int maxOf(int[] a) {
		int max = a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>max)
				max = a[i];
		}
		return max;
	}
	
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		
		int n = 1+rand.nextInt(10);
		int a[] = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = 100+rand.nextInt(90);
		}
		System.out.println(maxOf(a));
	}

}
