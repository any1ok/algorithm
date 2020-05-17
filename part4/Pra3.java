package part4;

public class Pra3 {
	private int max;
	private int ptrA;
	private int ptrB;
	private int[] stack;
	
	public class EmptyPra3Exception extends RuntimeException{
		public EmptyPra3Exception() {
			
		}}
	public class OverflowPra3Exception extends RuntimeException{
		public OverflowPra3Exception() {
			// TODO Auto-generated constructor stub
		}
	}
	public Pra3(int capacity) {
		ptrA =0;
		ptrB = capacity-1;
		max = capacity;
		try {
			stack = new int[max]; // 스택 본체용 배열을 생성
		} catch (OutOfMemoryError e) { // 생성할 수 없습니다.
			max = 0;
		}
	}
	public int push(char a,int x) throws OverflowPra3Exception{
		if(ptrA == ptrB +1)
			throw new OverflowPra3Exception();
		switch(a) {
		case 'A':
			stack[ptrA++]= x;
		case 'b':
			stack[ptrB--]= x;	
		}
		return x;
	}
	public int pop(char a)throws EmptyPra3Exception{
		int x=0;
		switch(a) {
		case 'A':
			if(ptrA<=0)
				throw new EmptyPra3Exception();
			x= stack[--ptrA];
			break;
		case 'B':
			if(ptrB >= max-1) {
				throw new EmptyPra3Exception();
			}
			x = stack[++ptrB];
		}
		return x;
	}
	
	


}
