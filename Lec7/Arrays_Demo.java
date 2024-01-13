package Lec7;

public class Arrays_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[5];
		System.out.println(arr);
		int[] other = arr;
		// update
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 6;
		arr[3] = 9;
		arr[4] = -11;
		// arr[5] = -191;
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
//		System.out.println(arr[4]);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < other.length; i++) {
			System.out.print(other[i] + " ");
		}
		System.out.println();
		// lenght
		System.out.println(arr.length);

	}

}
