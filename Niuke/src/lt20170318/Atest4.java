package lt20170318;

import java.util.SortedSet;
import java.util.TreeSet;

public class Atest4 {

	public static void main(String[] args) {
		TreeSet<String> sort = new TreeSet<>();
		sort.add("cbc");
		sort.add("cac");
		sort.add("bcz");
		sort.add("bcj");
		sort.add("aba");
		sort.add("aav");
		for (String s : sort) {
			System.out.println(s);
		}
	}
}
