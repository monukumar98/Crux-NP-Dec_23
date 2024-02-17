package Lec16;

public class SubSequnce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abc";
		//print(s, "");
		System.out.println(count(s, ""));

	}

	public static int count(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			return 1;
		}
		char ch = ques.charAt(0);
		int a1 = count(ques.substring(1), ans);
		int b1 = count(ques.substring(1), ans + ch);
		return a1 + b1;
	}

	static int c = 0;

	public static void print(String ques, String ans) {
		if (ques.length() == 0) {
			c++;
			System.out.println(ans);
			return;
		}
		char ch = ques.charAt(0);
		print(ques.substring(1), ans);
		print(ques.substring(1), ans + ch);
	}

}
