package Lec46;

public class Kartik_Bhaiya_And_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aaabaaaabaaabababaaaa";
		int k = 2;
		int flipb = Max_Len(s, k, 'b');
		int flipa = Max_Len(s, k, 'a');
		System.out.println(Math.max(flipa, flipb));

	}

	public static int Max_Len(String s, int k, char ch) {

		int si = 0, ei = 0, ans = 0, flip = 0;
		while (ei < s.length()) {
			// grow
			if (s.charAt(ei) == ch) {
				flip++;
			}

			// shrink
			while (flip > k && si <= ei) {
				if (s.charAt(si) == ch) {
					flip--;
				}
				si++;
			}

			// ans
			ans = Math.max(ans, ei - si + 1);

			ei++;
		}
		return ans;
	}

}
