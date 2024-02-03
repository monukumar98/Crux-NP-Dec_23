package Lec13;

public class String_Demo_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "hello";
		String s2 = "hello";
		String s3 = new String("hello");
		String s4 = new String("hello");
		System.out.println(s1);
		System.out.println(s2 == s4);
		System.out.println(s3 == s4);
		System.out.println(s2 == s1);
		System.out.println(s1.equals(s4));

	}

}
