package handlingSet;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class HandlingTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		TreeSet<Integer> a = new TreeSet<Integer>(Collections.reverseOrder());
		//Collections.reverseOrder() is used to print the data in reverse order.
		a.add(20);
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(10);
		a.add(30);
		System.out.println(a.size());
		Iterator<Integer> it = a.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
	}
	}

}
