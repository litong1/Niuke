package lt20170330;

import java.util.Iterator;
import java.util.LinkedList;

public class Atest1 {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
		System.out.println(list);
		if(null!=list&&list.size()>0){
			Iterator it = list.iterator();
			while(it.hasNext()){
				int i = (int) it.next();
				if(i>5){
					it.remove();
				}
			}
			System.out.println(list);
		}


	}
}
