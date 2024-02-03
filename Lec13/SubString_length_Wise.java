package Lec13;

public class SubString_length_Wise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "hello";
		for (int len = 1; len <= s.length(); len++) {
			for (int j = len; j <= s.length(); j++) {
				int i = j - len;
				System.out.println(s.substring(i, j));
			}
		}

	}

}
