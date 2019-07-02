package handlingSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class HandlingLinkedHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashSet<Integer> a = new LinkedHashSet<Integer>();
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
