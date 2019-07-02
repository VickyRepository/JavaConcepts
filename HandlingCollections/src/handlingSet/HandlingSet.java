package handlingSet;

import java.util.HashSet;
import java.util.Iterator;

public class HandlingSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<Integer> a = new HashSet<Integer>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(10);
		a.add(20);
		a.add(30);
		System.out.println(a.size());
		Iterator<Integer> it = a.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
