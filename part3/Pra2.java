package part3;

import java.util.Scanner;

public class Pra2 {

	public static void searchPrint(int[] a,int len,int f) {
		a[len] = f;
		int i=0;
		for(;i<len;i++) { 
			System.out.print(a[i]);
			if(a[i]==f)
				break;
		}
	}
	
	public static void main(String[] args) {
		Scanner var = new Scanner(System.in);
		int len = var.nextInt();
		int[] a = new int[len+1];
		System.out.println(a.length);
		for(int i=0;i<len;i++) {
			a[i] = var.nextInt();
			System.out.println(a[i]);
		}
		int k = var.nextInt();
		searchPrint(a,len,k);

	}

}
