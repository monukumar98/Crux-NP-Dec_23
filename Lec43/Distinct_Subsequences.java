package Lec43;

public class Distinct_Subsequences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "rabbbit";// coin
		String t = "rabbit";// amount
		System.out.println(Subsequences(s, t, 0, 0));

	}

// s--> coin array hai iska index i 
// t--> amount hai iska index j	
	public static int Subsequences(String s, String t, int i, int j) {
		if (j == t.length()) {
			return 1;// amount
		}
		if (i == s.length()) {
			return 0;
		}

		int inc = 0, exc = 0;
		if (s.charAt(i) == t.charAt(j)) {
			inc = Subsequences(s, t, i + 1, j + 1);
		}
		exc = Subsequences(s, t, i + 1, j);
		return inc + exc;

	}
}