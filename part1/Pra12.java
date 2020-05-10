package part1;

public class Pra12 {
	public static void main(String[] args) {
		
		for(int i=0;i<10;i++) {
			for(int j=0; j<10;j++) {
				if(i==0&&i==j) {
					System.out.print(" ");
				}
				
				else if(i==0) {
					System.out.print(j);
					System.out.print(" ");
				}
				else if(j==0) {
					System.out.print(i);
					System.out.print(" ");
				}
				else {
					System.out.print(i*j);
					System.out.print(" ");
				}
				
			}
			System.out.print("\n");
			}
		
}
}