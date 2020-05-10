package part1;

public class Pra15 {
	static void triangleLB(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(j <=i)
					System.out.print("*");
			}
			System.out.print("\n");
		}
		
	}
	static void triangleLU(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(j >=i)
					System.out.print("*");
			}
			System.out.print("\n");
		}
	}
	static void triangleRU(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(j <i)
					System.out.print(" ");
				else {
					System.out.print("*");
				}
			}
			System.out.print("\n");
		}
	}
	static void triangleRB(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(j <n-i-1)
					System.out.print(" ");
				else {
					System.out.print("*");
				}
			}
			System.out.print("\n");
		}
	}
	
	public static void main(String[] args) {
		int n=5;
		//triangleLB(5);
		//triangleLU(5);
		//triangleRU(5);
		triangleRB(5);
	}

}
