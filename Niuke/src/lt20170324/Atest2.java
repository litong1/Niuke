package lt20170324;

import java.util.ArrayList;
import java.util.Collections;

public class Atest2 {

	public static void main(String[] args) {

	}

	public int findMaxDivision(int[] A, int n) {
		
		ArrayList<Integer> list = new ArrayList<>();
		int rs = 0;
		for (int i : A) {
			list.add(i);
		}
		Collections.sort(list);
		for (int i = 0; i < list.size(); i++) {
			int max = list.get(i + 1) - list.get(i);
			if( max > rs){
				rs = max;
			}
		}
		return rs;

	}
}
