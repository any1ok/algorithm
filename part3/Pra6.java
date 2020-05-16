package part3;

import java.util.Arrays;
import java.util.Scanner;

public class Pra6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int[] x = new int[num]; 
		x[0] = scan.nextInt();

		for (int i = 1; i < num; i++) {
			do {
				x[i] = scan.nextInt();
			} while (x[i] < x[i - 1]); 
		}
		int ky = scan.nextInt();

		int idx = Arrays.binarySearch(x, ky); 
		System.out.println(idx);
		if (idx < 0) {
			int insPoint = -idx - 1;
			System.out.println(insPoint);
		} else
			System.out.println(idx);
	}
}
