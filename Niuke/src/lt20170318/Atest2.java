package lt20170318;

import java.util.ArrayList;
import java.util.Stack;

public class Atest2 {

	public static void main(String[] args) {
		System.out.println(unziping("2[a3[ab]]"));
	}

	public static String unziping(String s) {
		Stack<Character> stack = new Stack<>();

		String str = "";
		char[] ch = s.toCharArray();
		ArrayList<Character> list = new ArrayList<>();
		for (char c : ch) {
			list.add(c);
		}
	
		for (int i = 0; i < list.size(); i++) {
             char c = list.get(i);
			if (c != ']'&&c!='[') {
				if (c < 50 || c > 57) {
					stack.push(c);
				}
			} else if(c==']'){
				int k = i;
					
				StringBuilder sb = new StringBuilder();
				while (list.get(--k) != '[') {
					Character cha = stack.pop();
					sb.append(cha);
				}
				//2[3[c]]
				int m = list.get(k-1)- 48;			
				list.remove(k);				
				String temp = sb.reverse().toString();
				for (int j = 0; j < m; j++) {
					str += temp;
				}
				System.out.println(str);
				char[] chs = str.toCharArray();
				for (int n = 0; n < chs.length; n++) {
					stack.push(chs[n]);
				}
               
                
			}

		}

		return str;
	}

}
