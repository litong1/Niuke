package lt20170318;

import java.util.ArrayList;
import java.util.Stack;

public class Atest3 {

	public static void main(String[] args) {
		System.out.println(unziping("2[ab3[c]]5[vf2[b]]vb"));
	}

	// 2[ccc]
	public static String unziping(String s) {
		Stack<Character> stack = new Stack<>();
		Stack<Character> data = new Stack<>();
		String str = "";
		char[] ch = s.toCharArray();
		ArrayList<Character> list = new ArrayList<>();
		for (char c : ch) {
			list.add(c);
		}
		for (int i = 0; i < list.size(); i++) {
			char c = list.get(i);

			if (c < 50 || c > 57) {
				stack.push(c);
				if (stack.peek() == ']') {
					stack.pop();
					StringBuilder sb = new StringBuilder();
					while (stack.peek() != '[') {
						Character cha = stack.pop();
						sb.append(cha);
					}
					stack.pop();
					String temp = sb.reverse().toString();
					int m = list.get(list.indexOf(data.pop())) - 48;
					str = "";
					while (m != 0) {
						str += temp;
						m--;
					}
					char[] chs = str.toCharArray();
					for (int n = 0; n < chs.length; n++) {
						stack.push(chs[n]);
					}
				}

			} else {
				data.push(c);
			}

		}

		StringBuilder rs = new StringBuilder();
		for (Character d : stack) {
			rs.append(d);
		}
		return rs.toString();
	}

}
