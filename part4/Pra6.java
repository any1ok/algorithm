package part4;

public class Pra6<E> {
	
	public static class EmptyPra6Exception extends RuntimeException {
		public EmptyPra6Exception() {
		}
	}

	public static class OverflowPra6Exception extends RuntimeException {
		public OverflowPra6Exception() {
		}
	}

	private int front;
	private int rear;
	private int max;
	private int num;
	private E[] queue;
	public Pra6(int capacity) {
		num =front = rear =0;
		max = capacity;
		try {
			queue = (E[])new Object[max];
		}catch(OutOfMemoryError e) {
			max =0;
		}
		
	}
	public void enqueue(E x) throws OverflowPra6Exception{
		if(num>=max) {
			throw new OverflowPra6Exception();
		}
		queue[rear++] = x;
		num++;
		if(rear == max)
			rear =0;
		
	}
	public E dequeue()throws EmptyPra6Exception {
		if(num<=0) 
			throw new EmptyPra6Exception();
		
		E x = queue[front++];
		if(front == max)
			front =0;
		num--;
		return x;
		
	}
	public E peek() throws EmptyPra6Exception{
		if(num <=0)
			throw new EmptyPra6Exception();
		return queue[front];
		
	}
	public int indexOf(E x) {
		for (int i = 0; i < num; i++) {
			int idx = (i + front) % max;
			if (queue[idx] == x) // 검색성공
				return idx;
		}
		return -1; // 검색실패
	}
	public int search(E x) {
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
