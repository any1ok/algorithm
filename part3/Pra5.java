package part3;

import java.util.Scanner;

public class Pra5 {
	
	static int binarySearch(int pl, int pr,int key,int[] a) {
		int mid;
		int index = a.length;
		while(pl <= pr) {
			mid = (pl+pr)/2;
			System.out.println(a[pl]);
			System.out.println(a[pr]);
			if(a[mid]< key) {
				pl = mid+1;
				
			}
			else {
				pr = mid-1;
				if(a[mid] == key&&index >mid) {
					index = mid;
				}
			}
			
		}
		return index;
		
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++) {
			a[i]= scan.nextInt();
		}
		int key = scan.nextInt();
		System.out.println(binarySearch(0,n-1,key,a));
	}

}
