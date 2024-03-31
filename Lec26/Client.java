package Lec26;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Case-1
//		P obj = new P();
//		System.out.println(obj.d);
//		System.out.println(obj.d1);
//		obj.fun();
//		obj.fun1();
		// Case-2
//
//		P obj = new C();
//		System.out.println(obj.d);// P
//		System.out.println(obj.d1);// 10
//		System.out.println(((C) obj).d2);
//		System.out.println(((C) obj).d);// C
//		obj.fun();//C
//		obj.fun1();
//		((C) obj).fun2();

		// Case-3
//		C obj = new P();
//		System.out.println(obj.d);
//		System.out.println(obj.d1);
//		System.out.println(obj.d2);
//		obj.fun2();

		// Case-4
		
		C obj = new C();
		System.out.println(obj.d);
		System.out.println(obj.d1);//10
		System.out.println(obj.d2);//20
		System.out.println(((P)obj).d);
		obj.fun();
		obj.fun1();
		obj.fun2();

	}

}













