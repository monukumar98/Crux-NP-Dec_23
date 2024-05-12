package Lec38;

public class Print_SubSeqnce {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abc";
		SubSeqnce(s);

	}
	public static void SubSeqnce(String s) {
		int n = s.length();
		for (int i = 0; i < (1 << n); i++) {
			Pattern(i, s);
		}
	}
	private static void Pattern(int i, String s) {
		// TODO Auto-generated method stub
		int pos=0;
		while(i>0) {
			if((i&1)!=0) {
				System.out.print(s.charAt(pos));
			}
			pos++;
			i>>=1;
		}
		System.out.println();
		
	}

}
