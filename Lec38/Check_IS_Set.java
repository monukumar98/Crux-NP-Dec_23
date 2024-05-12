package Lec38;

public class Check_IS_Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =84;
		int i=3;
		
		int mask=(1<<i);
		if((n&mask)==0) {
			System.out.println("on_Set");
		}
		else {
			System.out.println("Set");
		}

	}

}

