package Lec16;

public class Coin_Toss_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		// print(n, "");
		System.out.println("\n" + count(n, ""));
	}

	public static int count(int n, String ans) {
		if (n == 0) {
			System.out.print(ans + " ");
			return 1;
		}
		int a1 = 0;
		if (ans.length() == 0 || ans.charAt(ans.length() - 1) != 'H') {
			a1 = count(n - 1, ans + "H");
		}
		int b1 = count(n - 1, ans + "T");
		return a1 + b1;

	}

	public static void print(int n, String ans) {
		if (n == 0) {
			System.out.println(ans);
			return;
		}
		if (ans.length() == 0 || ans.charAt(ans.length() - 1) != 'H') {
			print(n - 1, ans + "H");
		}
		print(n - 1, ans + "T");

	}

}
