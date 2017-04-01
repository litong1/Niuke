package lt20170318;
//输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
public class Atest1 {

	public static void main(String[] args) {
		System.out.println(NumberOf1(-2));
	}
	public static int NumberOf1(int n) {
		int count = 0;
		String str = null;
		if(n>=0){
			str = Integer.toBinaryString(n);
			System.out.println(str);
		}else{
			System.out.println(Integer.toBinaryString(~n));
			str = Integer.toBinaryString(~n + 1);
			System.out.println(str);
		}
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(c == '1'){
				count++;
			}
		}
		return count;

    }
}
