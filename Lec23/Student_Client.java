package Lec23;

public class Student_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ArrayList<Integer> ll = new  ArrayList<>();
		System.out.println("hello");
		Student s = new Student();
		System.out.println(s);
		s.name = "kaju";
		s.age = 19;
		System.out.println(s.name);
		System.out.println(s.age);
		s.Intro_yourSelf();
		Student s1 = new Student();
		s1.name = "Raju";
		s1.age = 20;
		s1.Intro_yourSelf();
		s1.SayHey("Ankit");
		Student.MentorName();
//		s1.MentorName();
	}
	static {
		System.out.println("I am in Static Main");
	}
}
