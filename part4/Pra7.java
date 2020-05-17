package part4;

public class Pra7 {
	
	public class EmptyPra7Exception extends RuntimeException{
		public EmptyPra7Exception() {
			
		}
	}
	public class OverflowPra7Exception extends RuntimeException{
		public OverflowPra7Exception(){
			
		}
	}
	private int front;
	private int rear;
	private int max;
	private int num;
	private int[] queue;
	public Pra7(int capacity) {
		num =front = rear =0;
		max = capacity;
		try {
			queue = new int[max];
		}catch(OutOfMemoryError e) {
			max =0;
		}
		
	}
	public void enqueue(int x) throws OverflowPra7Exception{
		if(num>=max) {
			throw new OverflowPra7Exception();
		}
		queue[rear++] = x;
		num++;
		if(rear == max)
			rear =0;
		
	}
	public void enqueueb(int x) throws OverflowPra7Exception{
		if(num>=max) {
			throw new OverflowPra7Exception();
		}
		queue[rear++] = x;
		num++;
		if (--front < 0)
			front = max - 1;
		queue[front] = x;
		
	}
	public int dequeue()throws EmptyPra7Exception {
		if(num<=0) 
			throw new EmptyPra7Exception();
		
		int x = queue[front++];
		if(front == max)
			front =0;
		num--;
		return x;
		
	}
	public int dequeueb()throws EmptyPra7Exception {
		if(num<=0) 
			throw new EmptyPra7Exception();
		num--;
		if (--rear < 0)
			rear = max - 1;
		return queue[rear];
		
		
		
	}
	public int peek() throws EmptyPra7Exception{
		if(num <=0)
			throw new EmptyPra7Exception();
		return queue[front];
		
	}
	public int peekb() throws EmptyPra7Exception{
		if(num <=0)
			throw new EmptyPra7Exception();
		int idx = rear == 0?max-1 :rear-1;
		return queue[idx];
		
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
