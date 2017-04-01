package lt20170324;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Atest1 {

	public static void main(String[] args) {

		int[] A = {0,1};
		System.out.println(findArrayMex(A, 2));
	}

	public static int findArrayMex(int[] A, int n) {
		ArrayList<Integer> list = new ArrayList<>();
		int rs = 0;
		for (int i : A) {
			list.add(i);
		}
		Collections.sort(list);
		int min = 0;
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i)>min){
				min = list.get(i);
				System.out.println(min);
				break;
			}
		}
		if(min == 1){
			for ( min = 1; min < Integer.MAX_VALUE; min++) {
				if(!list.contains(min)){
					rs = min;
					System.out.println(rs);
					break;
				}
			}
		}else{
			rs = 1;
		}
		return rs;

	}
}
