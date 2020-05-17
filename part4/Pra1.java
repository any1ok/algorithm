package part4;
import java.util.Scanner;

class Pra1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		IntStack stack = new IntStack(100);
		
		while(true) {
			int menu = scan.nextInt();
			if(menu == 0)
				break;
			switch(menu) {
			case 1:
				int x = scan.nextInt();
				try {
					stack.push(x);
				}catch(IntStack.OverflowIntStackException e) {
					System.out.println("full");
				}
				break;
			case 2:
				try {
					x = stack.pop();
					System.out.println(x);
					
				}catch (IntStack.EmptyIntStackException e) {
					System.out.println("empty");
				}
				break;
			case 3:
				try {
					x = stack.peek();
					System.out.println(x);
				} catch (IntStack.EmptyIntStackException e) {
					System.out.println("empty");
				}
				break;
			case 4:
				stack.dump();
				break;
			case 5:
				x = scan.nextInt();
				int n = stack.indexOf(x);
				System.out.println(n);
				break;
			case 6:
				stack.clear();
				break;
			}
			
		}
		
		
	}
}
