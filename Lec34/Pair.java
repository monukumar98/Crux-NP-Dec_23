package Lec34;

public class Pair<K, V> {
	K x;
	V y;

	public Pair(K x, V y) {
		this.x = x;
		this.y = y;
	}

	public K getx() {
		return x;
	}

	@Override
	public String toString() {
		return this.x + " " + this.y;
	}

	public static void main(String[] args) {
		Pair<Integer, Character> p = new Pair<>(10, 'B');
		Pair<Long, Boolean> p1 = new Pair<>(10010l, false);
		System.out.println(p.getx());
		System.out.println(p1.getx());
		System.out.println(p);
	}

}
