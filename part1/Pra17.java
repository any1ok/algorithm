package part1;

public class Pra17 {
	static void spira(int n) {
		for(int i=0;i<n;i++) {
			System.out.print(" ");
			for(int j=0;j<n;j++) {
				if(j <n-i-1)
					System.out.print(" ");
				else {
					
					int m = 1+2*(i);
					for(int t=0;t<m;t++) {
						System.out.print(i+1);
					}
					
					break;
				}
			}
			System.out.print("\n");
		}
		
		
	}
	

	public static void main(String[] args) {
		spira(5);
	}

}
