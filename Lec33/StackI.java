package Lec33;

public interface StackI {

	public void push(int item);

	public int pop();

	public static final int x = 9;

	public static void fun() {
		System.out.println("Hey");
		
	}

	default  void fun1() {
		System.out.println("Hey");
	}
	private static void fun3() {
		System.out.println("Hey");
		
	}

}
