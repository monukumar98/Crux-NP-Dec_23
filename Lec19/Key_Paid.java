package Lec19;

import java.util.ArrayList;
import java.util.List;

public class Key_Paid {
	static String[] key = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> ll = new ArrayList<>();
		String ques = "25";
		KeyPrint(ques, "",ll);
		System.out.println(ll);

	}

	public static void KeyPrint(String ques, String ans,List<String> ll ) {
		if (ques.length() == 0) {
//			System.out.print(ans + " ");
			ll.add(ans);
			return;
		}
		char ch = ques.charAt(0);// '2'
		String press = key[ch - 48];// abc
		for (int i = 0; i < press.length(); i++) {
			KeyPrint(ques.substring(1), ans + press.charAt(i),ll);
		}
	}

}
