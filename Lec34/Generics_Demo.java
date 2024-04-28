package Lec34;

public class Generics_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr = new Integer[5];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		Display(arr);
		String[] arr1 = { "Raj", "Ankit", "Puneet", "Kamlesh", "kaju" };
		Display(arr1);
		int [] a= new int [3];
	//	Display(a);

	}

	public static <T>void Display(T[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
