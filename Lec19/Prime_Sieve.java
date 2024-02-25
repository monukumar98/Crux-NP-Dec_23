package Lec19;

public class Prime_Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 100;
		PrintPrime(n);

	}

// false --> prime number 
// true --> not prime number 	
	public static void PrintPrime(int n) {
		boolean[] prime = new boolean[n + 1];
		prime[0] = true;// not prime number
		prime[1] = true;// not prime number
		for (int i = 2; i * i <= prime.length; i++) {
			if (prime[i] == false) {
				for (int j = 2; i * j < prime.length; j++) {
					prime[i * j] = true;// not prime number
				}
			}
		}
		for (int i = 2; i < prime.length; i++) {
			if (prime[i] == false) {
				System.out.println(i);
			}
		}
	}
}
