package part4;

public class Pra4 {
	
	public class EmptyPra4Exception extends RuntimeException{
		public EmptyPra4Exception() {
			
		}
	}
	public class OverflowPra4Exception extends RuntimeException{
		public OverflowPra4Exception(){
			
		}
	}
	private int max;
	private int num;
	private int[] queue;
	public Pra4(int capacity) {
		num =0;
		max = capacity;
		try {
			queue = new int[max];
		}catch(OutOfMemoryError e) {
			max =0;
		}
		
	}
	public void enqueue(int x) throws OverflowPra4Exception{
		if(num>=max) {
			throw new OverflowPra4Exception();
		}
		else {
			queue[num++] =x;
			
		}
	}
	public int dequeue()throws EmptyPra4Exception {
		if(num<=0) 
			throw new EmptyPra4Exception();
		
		int x = queue[0];
		for(int i=0;i<num-1;i++) {
			queue[i] = queue[i+1];
		}
		num--;
		return x;
		
	}
	public int peek() throws EmptyPra4Exception{
		if(num ==0)
			throw new EmptyPra4Exception();
		return queue[num-1];
		
	}
	public int indexOf(int x) {
		for(int i=0;i<num;i++) {
			if(queue[i]==x)
				return i;
		}
		return -1;
	}
	public void clear() {
		num = 0;
	}
	public int capacity() {
		return max;
	}
	public int size() {
		return num;
	}
	public boolean isEmpty() {
		return num <= 0;
	}
	public boolean isFull() {
		return num >= max;
	}
	public void dump() {
		if (num <= 0)
			System.out.println("큐가 비었습니다.");
		else {
			for (int i = 0; i < num; i++)
				System.out.print(queue[i] + " ");
			System.out.println();
		}
	}
	
}
