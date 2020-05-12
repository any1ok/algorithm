package part2;
import java.util.Scanner;

public class Pra10 {

	
	static class Vision{
		double vision;
		
		Vision(double vision){
			this.vision =vision;
		}
	}
	static void distVision(Vision[] v,int[] k) {
		
		for(int i=0;i<v.length;i++) {
			int t =((int)(v[i].vision*10));
			k[t]++;
			
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		Vision[] x = new Vision[n];
		int k[] = new int[22];
		for(int i=0;i<n;i++) {
			double v = scan.nextDouble();
			x[i] = new Vision(v);
		}
		distVision(x,k);
			
	
	for(int i=1;i<22;i++) {
		System.out.printf("%3.1f~：", i / 10.0);
		for(int j=0;j<k[i];j++) {
			System.out.print('*');
		}
		System.out.println();
	}
	
}
}