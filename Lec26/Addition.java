package Lec26;

public class Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Add(1, 2, 3, 7, 3, 4, 11, 45, 5, 5, 6, 6, 6, 7));
		System.out.println(Add(2, 5));
		System.out.println(Add(2, 5, 9));
		System.out.println(Add(2, 5, 19.0));

	}

	public static int Add(int x,int y,int... a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}

	public static int Add(int a, int b) {
		return a + b;

	}

	public static int Add(int a, int b, int c) {
		return a + b + c;

	}

	public static int Add(int a, int b, double c) {
		return (int) (a + b + c);

	}

}
