package Lec1;

public class Pre_Inc_Dec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 9;
//		System.out.println(++x);
//		System.out.println(x);
		int b = ++x - --x + --x + x++ + x-- + 11;
		System.out.println(b);

	}

}
