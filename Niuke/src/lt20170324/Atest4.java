package lt20170324;

import java.util.ArrayList;
import java.util.Collections;

public class Atest4 {

	public static void main(String[] args) {
		int[] A = { 127,250323,50722,55357,21696,15776,303030};
		System.out.println(findShortest(A, 7));
	}

	public static int findShortest(int[] A, int n) {

		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		int count = 0;
		for (int i : A) {
			list1.add(i);
			list2.add(i);
		}
		Collections.sort(list1);
		ArrayList<Integer> rs = new ArrayList<>();
		for (int i = 0; i < n; i++) {
		
			if (!list1.get(i).equals(list2.get(i)) ) {
				rs.add(i);
				count = rs.get(rs.size() - 1) - rs.get(0) + 1;
			}

		}
        System.out.println(rs);
		return count;

	}
}
