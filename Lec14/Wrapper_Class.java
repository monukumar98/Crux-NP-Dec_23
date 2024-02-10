package Lec14;

public class Wrapper_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 109;
		Integer a1 = 10;
		System.out.println(a);
		System.out.println(a1);
		Long a2 = 19L;
		a1 = a;// auto-Boxing
		int b = 90;
		Integer b1 = 11;
		b = b1;// un-boxing
		Integer c1 = 18;
		Integer c2 = 18;
		Integer c3 = 189;
		Integer c4 = 189;
		System.out.println(c1 == c2);
		System.out.println(c3 == c4);

	}

}
