package Lec33;

public class Abstract_Demo_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abstract_Child ab = new Abstract_Child();
		ab.val = 90;
		Abstract_Demo ab1 = new Abstract_Demo() {

			@Override
			public int Payment() {
				// TODO Auto-generated method stub
				return 0;
			}
			
		};
		Abstract_Demo ab2 = new Abstract_Demo() {
			
			@Override
			public int Payment() {
				// TODO Auto-generated method stub
				return 0;
			}
			
		};
	}

}
