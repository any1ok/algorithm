package part3;

import java.util.Scanner;

public class Pra4 {
	
	static int binarySearch(int pl, int pr,int key,int[] a) {
		int mid=0;
		int index = a.length;
		while(pl <= pr) {
			mid = (pl+pr)/2;
			if(a[mid] ==key) {
				break;
			}
			else if(a[mid]< key) {
				pl = mid+1;
			}
			else {
				pr = mid-1;
			}
			
		}
		return mid;
		
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
