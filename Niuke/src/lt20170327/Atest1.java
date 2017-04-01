package lt20170327;

import java.util.LinkedList;
import java.util.Scanner;

public class Atest1 {

	public static void main(String[] args) {

		
//		String str = "str";
//		
//		System.out.println(addToPalindrome("abc", 3));
		Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String str = sc.nextLine();
            String rs = Integer.toString(Integer.parseInt(str.substring(2),16));
            System.out.print(rs);
        }    
	}

	public static String addToPalindrome(String A, int n) {
		String returnStr = A.charAt(0) + "";
		String temp;
		for (int i = 1; i < n; i++) {
			temp = A.substring(i, n);
			if (huiwen(temp)) {
				break;
			}
			returnStr = A.charAt(i) + returnStr;
		}
		return returnStr;
	}

	public static boolean huiwen(String str) {

		StringBuilder sb = new StringBuilder(str);
		sb.reverse();// 将str倒置的方法
		String newStr = new String(sb);
		if (str.equals(newStr)) {
			return true;
		} else {
			return false;
		}
	}
}
