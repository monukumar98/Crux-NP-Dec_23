package Lec13;

import java.util.Scanner;

public class Playing_with_Good_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(Maxlen(s));

	}

	public static int Maxlen(String s) {
		int ans = 0;
		int c = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (isvowels(ch) == true) {
				c++;
			} else {
				ans = Math.max(ans, c);
				c = 0;
			}
		}
		ans = Math.max(ans, c);
		return ans;
	}

	public static boolean isvowels(char ch) {
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			return true;
		}
		return false;
	}

}
