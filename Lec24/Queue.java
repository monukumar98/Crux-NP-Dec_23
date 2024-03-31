package Lec24;

public class Queue {
	protected int[] arr;
	protected int front;
	private int size;

	public Queue() {
		// TODO Auto-generated constructor stub
		arr = new int[5];
	}

	public Queue(int n) {
		// TODO Auto-generated constructor stub
		arr = new int[n];
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public boolean isfull() {
		return size == arr.length;
	}

	public void Enqueue(int item) throws Exception {
		if (isfull()) {
			throw new Exception("bklol Queue full h");
		}
		int rear = (front + size) % arr.length;
		arr[rear] = item;
		size++;
	}

	public int Dequeue() throws Exception {
		if(isEmpty()) {
			throw new Exception("bklol Queue empty h");	
		}
		int v = arr[front];
		front = (front + 1) % arr.length;
		size--;
		return v;
	}

	public int getFront() throws Exception {
		if(isEmpty()) {
			throw new Exception("bklol Queue empty h");	
		}
		int v = arr[front];
		return v;
	}
	public void Display() {
		for (int i = 0; i <size; i++) {
			int idx=(front+i)%arr.length;
			System.out.print(arr[idx]+" ");
			
		}
		System.out.println();
	}

}
















