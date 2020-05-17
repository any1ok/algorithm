package part4;


public class Pra5 {
	
	public class EmptyPra5Exception extends RuntimeException{
		public EmptyPra5Exception() {
			
		}
	}
	public class OverflowPra5Exception extends RuntimeException{
		public OverflowPra5Exception(){
			
		}
	}
	private int front;
	private int rear;
	private int max;
	private int num;
	private int[] queue;
	public Pra5(int capacity) {
		num =front = rear =0;
		max = capacity;
		try {
			queue = new int[max];
		}catch(OutOfMemoryError e) {
			max =0;
		}
		
	}
	public void enqueue(int x) throws OverflowPra5Exception{
		if(num>=max) {
			throw new OverflowPra5Exception();
		}
		queue[rear++] = x;
		num++;
		if(rear == max)
			rear =0;
		
	}
	public int dequeue()throws EmptyPra5Exception {
		if(num<=0) 
			throw new EmptyPra5Exception();
		
		int x = queue[front++];
		if(front == max)
			front =0;
		num--;
		return x;
		
	}
	public int peek() throws EmptyPra5Exception{
		if(num <=0)
			throw new EmptyPra5Exception();
		return queue[front];
		
	}
	public int indexOf(int x) {
		for (int i = 0; i < num; i++) {
			int idx = (i + front) % max;
			if (queue[idx] == x) // 검색성공
				return idx;
		}
		return -1; // 검색실패
	}
	public int search(int x) {
		for (int i = 0; i < num; i++) {
			int idx = (i + front) % max;
			if (queue[idx] == x) // 검색성공
				return idx+1;
		}
		return 0; // 검색실패
	}
	public void clear() {
		num = front = rear = 0;
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
			for (int i = 0; i < num; i++) {
				int idx = (i + front) % max;
				System.out.print(queue[idx]);
			}
			System.out.println();
		}
	}

}
