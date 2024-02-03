package Lec13;

public class Reverse_Words_in_a_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "   hello             world   ";
		System.out.println(Reverse(s));

	}

	public static String Reverse(String s) {
		s = s.trim();
		String[] arr = s.split(" +");
		String ans = "";
		for (int i = arr.length - 1; i >= 0; i--) {
			ans += arr[i] + " ";
		}
		return ans.trim();
	}
}
