package lt20170321;

import java.util.LinkedList;

//世界上有10种人，一种懂二进制，一种不懂。那么你知道两个int32整数m和n的二进制表达，有多少个位(bit)不同么？ 
public class Atest1 {

	public static void main(String[] args) {
		countBitDiff(0, 0);
	}

	/**
	 * 获得两个整形二进制表达位数不同的数量
	 * 
	 * @param m
	 *            整数m
	 * @param n
	 *            整数n
	 * @return 整型
	 */
	public static int countBitDiff(int m, int n) {
		String strm = Integer.toBinaryString(m);
		String strn = Integer.toBinaryString(n);
	
		char[] cm = strm.toCharArray();
		char[] cn = strn.toCharArray();
		int length = 0;
		int count = 0;
		LinkedList<Character> listm = new LinkedList<>();
		for (Character ch : cm) {
			listm.add(ch);
		}
		LinkedList<Character> listn = new LinkedList<>();
		for (Character ch : cn) {
			listn.add(ch);
		} 
		if (strm.length() == strn.length()) {
			length = strm.length();
			for (int i = length - 1; i > 0; i--) {
				if (cm[i] != cn[i]) {
					count++;
				}
			}
		} else if (listm.size() > listn.size()) {
			while (listn.size() != listm.size()) {
				listn.addFirst('0');
			}
			for (int i = 0;i < listm.size();i++) {
				if (listm.get(i) != listn.get(i)) {
					count++;
				}
			}
		} else if (listm.size() < listn.size()) {
			while (listn.size() != listm.size()) {
				listm.addFirst('0');
			}
			for (int i = 0;i < listn.size();i++) {
				if (listm.get(i) != listn.get(i)) {
					count++;
				}
			}
		}
		System.out.println(count);
		return count;

	}
}
