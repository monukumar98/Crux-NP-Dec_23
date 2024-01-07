package Lec6;

public class Static_Var {

	static int val = 90;

	public static void main(String[] args) {
		System.out.println("Hello");
		int a = 9;
		int b = 7;
		System.out.println(val);
		System.out.println(Add(a, b));
		System.out.println("WoW");
		System.out.println(val);
	}

	public static int Add(int a, int b) {

		int c = a + b;
		int val = 60;
		Static_Var.val += 5;
		return c;
	}
}
