package part5;

import java.util.Scanner;

public class Pra3 {

public static int gcd(int a,int b) {
		while(a%b !=0) {
			int k=b;
			b = a%b;
			a = k;
		}
		return b;
	}
public static int gcdArr(int[] a,int k) {
	int t = a[0];
	
	while(k!=1) {
		int m;
		k--;
		m = gcd(t,a[k]);
		t = m;
	}
	return t;
}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int a[] =new int[num];
		
		for(int i=0;i<num;i++) {
			a[i] = scan.nextInt();
		}
		gcdArr(a,num);
		
	}

}
