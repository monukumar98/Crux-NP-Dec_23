package Lec23;

public class Person_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("Raj", 22);
		Person p2 = new Person("Shivam", 28);
		System.out.println(p1.age + " " + p1.name);
		p2.age = -9;

	}

}
