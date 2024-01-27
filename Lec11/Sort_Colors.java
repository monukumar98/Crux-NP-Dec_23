package Lec11;

public class Sort_Colors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 0, 2, 1, 1, 0 };
		DNF(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	public static void DNF(int[] arr) {
		int r = 0;// red ko 0
		int p = arr.length - 1;// pink ko 2
		int i = 0;
		while (i <= p) {
			if (arr[i] == 2) {// pink
				int temp = arr[p];
				arr[p] = arr[i];
				arr[i] = temp;
				p--;

			} else if (arr[i] == 0) {// red
				int temp = arr[r];
				arr[r] = arr[i];
				arr[i] = temp;
				r++;
				i++;
			} else {// white
				i++;
			}
		}
	}

}
