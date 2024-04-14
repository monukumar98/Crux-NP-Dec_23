package Lec30;

public class BInary_Tree_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Binary_Tree bt = new Binary_Tree();
		//10 true 20 true 40 false false true 50 false false true 30 false true 60 true 70 false false false
		bt.Display();
		System.out.println(bt.max());
		System.out.println(bt.find(50));
		System.out.println(bt.ht());
		bt.PreOrder();
		bt.POStOrder();
		bt.INOrder();
		bt.levelOrder();

	}

}
