package Lec24;

public class Stack {

	protected int[] arr;
	private int idx;

	public Stack() {
		// TODO Auto-generated constructor stub
		arr = new int[5];
	}

	public Stack(int n) {
		// TODO Auto-generated constructor stub
		arr = new int[n];
	}

	public boolean isEmpty() {
		return this.idx == 0;
	}

	public boolean isFull() {
		return this.idx == arr.length;

	}

	public void push(int item) throws Exception {
		if (isFull()) {
			throw new Exception("sun bhai Stack full hai ");
		}
		this.arr[this.idx] = item;
		this.idx++;

	}

	public int pop() throws Exception {
		if (isEmpty()) {
			throw new Exception("sun bhai Stack empty hai ");
		}
		idx--;
		return arr[idx];
	}

	public int peek() throws Exception {
		if (isEmpty()) {
			throw new Exception("sun bhai Stack empty hai ");
		}
		return arr[idx - 1];
	}

	public int size() {
		return this.idx;
	}

	public void Display() {
		for (int i = 0; i < idx; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
