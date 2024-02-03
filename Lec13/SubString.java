package Lec13;

public class SubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "hello";
//		System.out.println(s.substring(1, 3));
//		System.out.println(s.substring(1, 1));
//		System.out.println(s.substring(1));
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j <= s.length(); j++) {
				System.out.println(s.substring(i, j));
			}
		}

	}

}
