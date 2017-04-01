package lt20170326;

import java.util.ArrayList;
import java.util.Collections;

public class Test3 {

	public static void main(String[] args) {

		int[] A = {28,75,38,44,66,1};
		System.out.println(findMaxGap(A, 6));
	}

	public static int findMaxGap(int[] A, int n) {
		ArrayList<Integer> left;
		ArrayList<Integer> right;
		int max = 0;

		for (int k = 0; k <= n - 2; k++) {
			left = new ArrayList<>();
			for (int k1 = 0; k1 <= k; k1++) {
				left.add(A[k1]);
			}
			Collections.sort(left);
			System.out.println("left： " + left);
			right = new ArrayList<>();
			for (int k2 = k + 1; k2 <= n-1; k2++) {
				right.add(A[k2]);
			}
			Collections.sort(right);
			System.out.println("right： "+right);
			int rs = Math.abs(left.get(left.size() - 1) - right.get(right.size() - 1));
			if (rs > max) {
				max = rs;
			}
		}

		return max;

	}
}
