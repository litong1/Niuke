package lt20170324;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Atest3 {

	public static void main(String[] args) {
		int[] A = {1,3,8,7,6,4,5,2};
		System.out.println(Arrays.toString(findKthNumbers(A, 8,4)));
	}
	public static int[] findKthNumbers(int[] A, int n, int k) {
		ArrayList<Integer> list = new ArrayList<>();		
		for (int i : A) {
			list.add(i);
		}
		Collections.sort(list);
		ArrayList<Integer> list2 = new ArrayList<>();
		for (int i = k; i < n; i++) {					
			list2.add(list.get(i));
		}
		ArrayList<Integer> list3 = new ArrayList<>();
		for (int i : A) {
			list3.add(i);
		}
		list3.removeAll(list2);
		int[] rs = new int[k];
		for (int i = 0; i < list3.size(); i++) {
			rs[i] = list3.get(i);
		}
		return rs;
     
    }
}
