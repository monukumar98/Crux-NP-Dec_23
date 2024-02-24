package Lec18;

public class Check_Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 89;
		System.out.println(ISprime(n));

	}

	public static boolean ISprime(int n) {
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				return false;
			}

		}
		return true;
	}
}
