package Lec37;

public class String_Builder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		sb.append("Hello");
		System.out.println(sb.capacity());
		System.out.println(sb);
		sb.insert(1, "ab");
		System.out.println(sb);
		sb.append(1);
		System.out.println(sb);
		sb.append("abcdefgh");
		System.out.println(sb.length());
		sb.append('B');
		System.out.println(sb.capacity());
		System.out.println(sb.substring(1, 3));
		System.out.println(sb.charAt(2));
		String s = sb.toString();// builder to String
		StringBuilder sb1 = new StringBuilder(s);// string to builder
	}

}
