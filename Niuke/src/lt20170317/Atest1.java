package lt20170317;

import java.util.ArrayList;

public class Atest1 {

	public static void main(String[] args) {
		System.out.println(LastRemaining_Solution(5, 3));
	}
	 public static int LastRemaining_Solution(int n, int m) {
		 
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			list.add(i);
		}	
		int num = 0;
		while(n!=1){			
					
			if(num == m-1){
				n--;
				if(n==1){
					break;
				}
				System.out.println(num);
				list.remove(num);
				num = 0;				
			}
			num = (num++)%n;
		}
		return list.get(0);
	        
	    }
}
