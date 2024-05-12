package Lec38;

import java.util.Scanner;

public class Tavas_and_SaDDas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(Count(s));

	}

	public static int Count(String s) {
		int n = s.length();
		int c = (1 << n) - 2;
		int pos = 0;
		for (int i = n - 1; i >= 0; i--) {
			if (s.charAt(i) == '7') {
				c = c + (1 << pos);
			}
			pos++;

		}
		return c+1;
	}

}
