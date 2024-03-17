package Lec24;
public class Student {
	private String name = "raj";
	private int age = 20;

	public Student(String name, int age) {
		// TODO Auto-generated constructor stub
		this.age = age;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		try {
			if (age < 0) {
				throw new Exception("bklol age -ve nhi hoga");

			}

			this.age = age;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			// System.out.println(e);
		} finally {
			System.out.println("I am in finaly block");
		}
	}

//	public void setAge(int age) throws Exception {
//		if (age < 0) {
//		throw	new Exception("bklol age -ve nhi hoga");
//			
//		}
//
//		this.age = age;
//	}

//	public int getAge() {
//		return age;
//	}
//
//	public void setAge(int age) {
//		this.age = age;
//	}

	public void Intro_yourSelf() {

		System.out.println("My Name is " + this.name + " and age is " + this.age);

	}

}
