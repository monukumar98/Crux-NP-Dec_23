package Lec26;

public class Student {

	String name = "kaju";
	int age = 18;

	@Override
	public String toString() {
		return name + "  " + age;
	}

	public static void main(String[] args) {
		Student s = new Student();

		System.out.println(s);
	}

}
