package Lec22;

import java.util.Random;

public class Random_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rn = new Random();
		int si = 10;
		int ei = 13;
		for (int i = 0; i < 10; i++) {
			int r = rn.nextInt(ei - si + 1)+si;
			System.out.println(r);

		}

	}

}
