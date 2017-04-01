package lt20170326;

public class Atest2 {

	public static void main(String[] args) {

		String A = "acbcbcbc";
		System.out.println(A.indexOf("bc"));
	}

	public int findAppearance(String A, int lena, String B, int lenb) {

		if(A.contains(B)){
			return A.indexOf(B);
		}else{
			return -1;
		}
		

	}
}
