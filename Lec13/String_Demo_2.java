package Lec13;

public class String_Demo_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "hello";
		String s2 = "bye";
		String s3 = s1 + "bye";
		// s3 = s1.concat(s2);
		String s4 = "hello" + "bye";
		int[] arr = new int[3];
		System.out.println(arr.length);
		System.out.println(s4.length());
		System.out.println(s4.charAt(4));
		System.out.println("hello" + 10 + 20 + "bye");
		System.out.println("hello" + (10 + 20) + "bye");
		System.out.println(10 + 20 + "bye");
	}

}
